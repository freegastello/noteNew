package com.glushkoproduction.note.tempLessons;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class TempLessonsTests {
    @Test
    public void readAndSavePicturesTest() {
        String fileName = "seaCopy";
        String ext = "jpg";
        File pathOoutput = new File("pictures/" + fileName + "." + ext);
        BufferedImage img = null;
        BufferedImage img2 = null;
        try {
            // Прочитать картинку с диска
            img = ImageIO.read(new File("pictures/sea.jpg"));
            // Записать изображение обратно на диск создав дубль
            ImageIO.write(img, ext, pathOoutput);
            // Проверка чтения нового файла
            img2 = ImageIO.read(new File("pictures/" + fileName + "." + ext));
        } catch (IOException e) {
            System.out.println("ERROR - " + e.getMessage());
        }
        assertNotEquals(null, img);
        assertNotEquals(null, img2);
    }

}
