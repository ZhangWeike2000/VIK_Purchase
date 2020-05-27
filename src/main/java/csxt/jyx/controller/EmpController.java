package csxt.jyx.controller;

import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
public class EmpController {

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
