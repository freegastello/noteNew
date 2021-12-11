package com.glushkoproduction.note.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium {

    @Test
    public void selenium_1_Test() {
        System.setProperty("webdriver.chrome.driver","D:\\YandexDisk\\IdaProject\\Chromedriver\\chromedriver.exe");
        String baseUrl = "http://localhost:9191/all";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);

        WebElement inp1 = driver.findElement(By.cssSelector("input[name='num']"));
        inp1.sendKeys("mmm");

        WebElement inp2 = driver.findElement(By.cssSelector("input[name='year']"));
        inp2.sendKeys("25");

        WebElement inp3 = driver.findElement(By.cssSelector("input[name='name']"));
        inp3.sendKeys("nnn");

        WebElement btn1 = driver.findElement(By.xpath("//button[text()='Сохранить']"));
        btn1.click();
    }


    @Test
    public void seleniumPageTest() {
        System.setProperty("webdriver.chrome.driver","D:\\YandexDisk\\IdaProject\\Chromedriver\\chromedriver.exe");
        String baseUrl = "http://localhost:9191/all";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseUrl);


    }



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
