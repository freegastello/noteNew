package com.glushkoproduction.note.testLessons.exampleTwo;

import com.glushkoproduction.note.dto.ExcelParcerDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ExcelWriter_4 {
    public static void write(List<ExcelParcerDTO> excelParcerDTOList) {
        String file = "WriteExcel.xlsx";
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Birthdays");

        // Нумерация начинается с нуля
        Row row = sheet.createRow(0);

        // Мы запишем имя и дату в два столбца
        // имя будет String, а дата рождения --- Date,
        // формата dd.mm.yyyy
        Cell name = row.createCell(0);
        name.setCellValue("John");

        Cell birthdate = row.createCell(1);

        DataFormat format = book.createDataFormat();
        CellStyle dateStyle = book.createCellStyle();
        dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
        birthdate.setCellStyle(dateStyle);


        // Нумерация лет начинается с 1900-го
        birthdate.setCellValue(new Date(110, 10, 10));

        // Меняем размер столбца
        sheet.autoSizeColumn(1);

        // Записываем всё в файл
        try {
            book.write(new FileOutputStream(file));
            book.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("ERROR. Файл не найден. " + e.getMessage());
        } catch (IOException ioe) {
            throw new RuntimeException("ERROR. Не произошло закрытия Workbook. " + ioe);
        }
    }

}
