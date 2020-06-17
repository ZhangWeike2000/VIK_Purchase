package csxt.jyx.controller;

import com.github.pagehelper.PageInfo;
import csxt.entity.SupplierFile;
import csxt.jyx.service.SupplierFileService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.net.URLEncoder;
import java.util.List;

/**
 * (SupplierFile)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:55:19
 */
@RestController
@CrossOrigin
@RequestMapping("supplierFile")
public class SupplierFileController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierFileService supplierFileService;
    /**
     * 修改数据
     *
     * @param supplierFile 实例对象
     * @return 影响行数
     */
    @PutMapping("updateById")
    public void updateById(@RequestBody SupplierFile supplierFile){

        supplierFileService.update(supplierFile);
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public SupplierFile selectOne(@PathVariable("id") Integer id) {
        return this.supplierFileService.queryById(id);
    }


    /**
     * 查询指定行数据
     *
     * @param currNo   查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    @GetMapping("getAllSupplierFile/{tag}")
    public PageInfo<SupplierFile> getAll(Integer currNo, Integer pageSize,@PathVariable("tag") String tag) {
        PageInfo<SupplierFile> pageInfo = this.supplierFileService.getAll(currNo, pageSize,tag);
        return pageInfo;
    }


    /**
     * 新增数据
     *
     * @param supplierFile 实例对象
     * @return 影响行数
     */
    @PostMapping("addSupplierFile")
    public SupplierFile insert(@RequestBody SupplierFile supplierFile) {
        System.out.println(supplierFile.toString());
        return supplierFileService.insert(supplierFile);
    }

    /**
     * 修改数据
     *
     * @param supplierFile 实例对象
     * @return 影响行数
     */
    //public int update(SupplierFile supplierFile);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    // public int deleteById(Integer id);

    /**
     * 供应商档案导出
     */
    @GetMapping("Excel")
    public void Excel(HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");
        List<SupplierFile> supplierFileList = supplierFileService.queryAll("R001-0");
        String fileName = "供应商档案表" + ".xls";
        int rowNum = 1;
        String[] headers = {"供应商名称", "地址", "产品I级分类名称", "产品II级分类名称"
                , "产品III级分类名称", "供应商曾用名", "开户银行", "银行账户", "网址", "电话", "传真", "邮政编码"
                , "所在区域名称", "优质级别名称", "联系人", "联系人部门", "联系人职务", "联系人办公电话", "联系人手机",
                "联系人家庭电话", "联系人邮箱", "联系人性别", "开票信息", "推荐供应产品集合", "登记人", "登记时间",
                "采购人","采购人编号"};//, "采购人编号"
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell((short) i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }
        for (SupplierFile list : supplierFileList) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(list.getSupplierName());
            row1.createCell(1).setCellValue(list.getAddress());
            row1.createCell(2).setCellValue(list.getFirstKindName());
            row1.createCell(3).setCellValue(list.getSecondKindName());
            row1.createCell(4).setCellValue(list.getThirdKindName());
            row1.createCell(5).setCellValue(list.getFormerName());
            row1.createCell(6).setCellValue(list.getBankType());
            row1.createCell(7).setCellValue(list.getBankAccount());
            row1.createCell(8).setCellValue(list.getUrl());
            row1.createCell(9).setCellValue(list.getPhone());
            row1.createCell(10).setCellValue(list.getFax());
            row1.createCell(11).setCellValue(list.getPostalCode());
            row1.createCell(12).setCellValue(list.getAreaName());
            row1.createCell(13).setCellValue(list.getRankName());
            row1.createCell(14).setCellValue(list.getFirstContacts());
            row1.createCell(15).setCellValue(list.getFirstDepartment());
            row1.createCell(16).setCellValue(list.getFirstDuty());
            row1.createCell(17).setCellValue(list.getFirstOfficePhone());
            row1.createCell(18).setCellValue(list.getFirstPhone());
            row1.createCell(19).setCellValue(list.getFirstFamilyPhone());
            row1.createCell(20).setCellValue(list.getFirstEmail());
            row1.createCell(21).setCellValue(list.getFirstSex());
            row1.createCell(22).setCellValue(list.getBillingInformation());
            row1.createCell(23).setCellValue(list.getRecommendGather());
            row1.createCell(24).setCellValue(list.getRegister());
            row1.createCell(25).setCellValue(list.getRegisterTime());
            row1.createCell(26).setCellValue(list.getBuyer());
            if(list.getBuyerNumber()==0){
                row1.createCell(27).setCellValue("");
            }else {
                row1.createCell(27).setCellValue(list.getBuyerNumber());
            }
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ";filename*=utf-8''" + URLEncoder.encode(fileName, "UTF-8"));
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }
    /**
     * 供应商档案导入
     */
    @PostMapping("readExcel")
    public void readExcel(@RequestBody List<SupplierFile> list){
        for (SupplierFile supplierFile : list) {
            supplierFileService.insert(supplierFile);
        }
    }
}

