package com.glushkoproduction.note.testLessons.exampleTwo;

import com.glushkoproduction.note.dto.ExcelParcerDTO;
import com.glushkoproduction.note.utils.FormatUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter_5 {
    public static void write(List<ExcelParcerDTO> list) {
        String file = "WriteExcel_5.xlsx";
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("FirstList");

        for (int i = 0; i < list.size(); i++) {
            Row row = sheet.createRow(i);

            Cell cellNum = row.createCell(0);
            cellNum.setCellValue(list.get(i).getNum());
            cellNum.setCellStyle(FormatUtil.formatNumberInteger(book));

            Cell cellResult = row.createCell(1);
            cellResult.setCellValue(list.get(i).getResult());
            cellResult.setCellStyle(FormatUtil.formatNumberText(book));

            Cell cellSum = row.createCell(2);
            cellSum.setCellValue(list.get(i).getSum());
            cellSum.setCellStyle(FormatUtil.formatNumberRoundingToTwoDigits(book));
        }

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
