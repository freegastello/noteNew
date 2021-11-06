package com.glushkoproduction.note.testLessons.exampleTwo;

import com.glushkoproduction.note.dto.ExcelParcerDTO;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;// Можно и так

/**
 * Парсер нового формата Excel -> .xlsx
 **/

public class ExcelParser_3 {
    public static List<ExcelParcerDTO> parse(String fileName) {
        Workbook workBook = null;
        try {
            InputStream inputStream = new FileInputStream(fileName);//d:\temp\MyFirstExcel_3.xlsx

            if(fileName.toLowerCase().endsWith("xlsx")) {
                workBook = new XSSFWorkbook(inputStream);
            } else if (fileName.toLowerCase().endsWith("xls")) {
//                workBook = new HSSFWorkbook(inputStream);// Можно и так
                workBook = WorkbookFactory.create(inputStream);
            }
            //workBook = XSSFWorkbookFactory.create(inputStream);
//            workBook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //разбираем первый лист входного файла на объектную модель
        Sheet sheet = workBook.getSheetAt(0);//0-Первая страница//1-Вторая страница
        List<ExcelParcerDTO> list = new ArrayList<>();

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            ExcelParcerDTO dto = new ExcelParcerDTO();
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                if (j == 0) {
                    dto.setNum((int) row.getCell(j).getNumericCellValue());
                } else if (j == 1) {
                    dto.setResult(row.getCell(j).getStringCellValue());
                } else if (j == 2) {
                    dto.setSum((float) row.getCell(j).getNumericCellValue());
                } else {
                    throw new RuntimeException("ERROR!!! Лишняя ячейка.");
                }
            }
            list.add(dto);
        }
        return list;
    }
}
