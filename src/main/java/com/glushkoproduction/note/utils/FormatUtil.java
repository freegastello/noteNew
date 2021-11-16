package com.glushkoproduction.note.utils;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Workbook;

public class FormatUtil {
    public static CellStyle formatNumberInteger (Workbook book) {
        DataFormat format = book.createDataFormat();
        CellStyle dateStyle = book.createCellStyle();
        dateStyle.setDataFormat(format.getFormat("0"));
//        dateStyle.setDataFormat(format.getFormat("# ##0"));
        return dateStyle;
    }

    public static CellStyle formatNumberText (Workbook book) {
        DataFormat format = book.createDataFormat();
        CellStyle dateStyle = book.createCellStyle();
        dateStyle.setDataFormat(format.getFormat("@"));
        return dateStyle;
    }

    public static CellStyle formatNumberRoundingToTwoDigits(Workbook book) {
        DataFormat format = book.createDataFormat();
        CellStyle dateStyle = book.createCellStyle();
        dateStyle.setDataFormat(format.getFormat("# ### ### ##0.00"));
        return dateStyle;
    }
}
