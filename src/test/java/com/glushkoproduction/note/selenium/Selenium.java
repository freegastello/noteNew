package com.glushkoproduction.note.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    @Test
    public void seleniumTest() {
        System.setProperty("webdriver.chrome.driver","D:\\YandexDisk\\IdaProject\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        String baseUrl = "http://localhost:8080/all";
        String baseUrl = "http://yandex.ru";
        String expectedTitle = "Яндекс";//Ожидаемый title страницы
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();//Получаем title со страницы

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }

    private void print(String string){
        System.out.println(string);
    }

}
