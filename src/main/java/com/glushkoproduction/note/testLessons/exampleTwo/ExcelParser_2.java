package com.glushkoproduction.note.testLessons.exampleTwo;

import com.glushkoproduction.note.dto.ExcelParcerDTO;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Парсер старого формата Excel -> .xls
 **/

public class ExcelParser_2 {
    public static List<ExcelParcerDTO> parse(String fileName) {
        HSSFWorkbook workBook = null;
        try {
            // Workbook wb = WorkbookFactory.create(new File("test.xls"));
            // Sheet s = wb.getSheetAt(0);
            InputStream inputStream = new FileInputStream(fileName);
            workBook = new HSSFWorkbook(inputStream);
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
