package com.glushkoproduction.note.testLessons.exampleTwo;

import com.glushkoproduction.note.dto.ExcelParcerDTO;

import java.util.List;

public class MainClassParcerExcel {
    public static void main(String[] args){
//        System.out.println(ExcelParser.parse("d:\\temp\\MyFirstExcel.xls").toString());
//        System.out.println(ExcelParserNew.parse("d:\\temp\\MyFirstExcel.xls").toString());
//        System.out.println(ExcelParser_2.parse("d:\\temp\\MyFirstExcel.xls").toString());

        // Основные запускные классы:
//        System.out.println(ExcelParser_3.parse("d:\\temp\\MyFirstExcel.xls").toString());

        List<ExcelParcerDTO> excelParcerDTOList = ExcelParser_3.parse("d:\\temp\\MyFirstExcel_3.xlsx");
        System.out.println(excelParcerDTOList);

        ExcelWriter_5.write(excelParcerDTOList);
    }
}
