package csxt.jyx.controller;

import csxt.entity.SupplierArea;
import csxt.jyx.service.SupplierAreaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SupplierArea)表控制层
 *
 * @author makejava
 * @since 2020-05-27 20:30:32
 */
@RestController
@RequestMapping("supplierArea")
public class SupplierAreaController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierAreaService supplierAreaService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public SupplierArea selectOne(@PathVariable("id") Integer id) {
        return this.supplierAreaService.queryById(id);
    }
//    @GetMapping(value = "/UserExcelDownloads")
//    public void UserExcelDownloads(HttpServletResponse response)throws IOException {
//        /*@Transactional*/
//        HSSFWorkbook workbook = new HSSFWorkbook();
//        HSSFSheet sheet = workbook.createSheet("信息表");
//        List<Emp> UserExcelDownloads = empService.getAll();
//        String fileName = "员工表" + ".xls";
//        int rowNum = 1;
//        String [] headers = {"编号","姓名","年龄","薪水","爱好","地址"};
//        HSSFRow row = sheet.createRow(0);
//        for (int i = 0;i<headers.length;i++){
//            HSSFCell cell = row.createCell((short) i);
//            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
//            cell.setCellValue(text);
//        }
//        for (Emp emp : UserExcelDownloads){
//            HSSFRow row1 = sheet.createRow(rowNum);
//            row1.createCell(0).setCellValue(emp.getId());
//            row1.createCell(1).setCellValue(emp.getName());
//            row1.createCell(2).setCellValue(emp.getAge());
//            row1.createCell(3).setCellValue(emp.getSalary());
//            row1.createCell(4).setCellValue(emp.getHobby());
//            row1.createCell(5).setCellValue(emp.getSite());
//            rowNum++;
//        }
//        response.setContentType("application/octet-stream");
//        response.setHeader("Content-disposition", "attachment;filename=" + fileName+";filename*=utf-8''" + URLEncoder.encode(fileName, "UTF-8"));
//        response.flushBuffer();
//        workbook.write(response.getOutputStream());
//    }
}