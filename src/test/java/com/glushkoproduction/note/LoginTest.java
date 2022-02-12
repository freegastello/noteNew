package com.glushkoproduction.note;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;
//    public static ProfilePage profilePage;

    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));
    }

//    @AfterClass
//    public static void tearDown() {
//        profilePage.entryMenu();
//        profilePage.userLogout();
//        driver.quit();
//    }


    @Test
    public void loginTest() {
        //значение login/password берутся из файла настроек по аналогии с chromedriver
        //и loginpage
        //вводим логин
        loginPage.inputLogin(ConfProperties.getProperty("login"));

        LoginPage x = loginPage;

        //вводим пароль
        loginPage.inputPasswd(ConfProperties.getProperty("password"));

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        //получаем отображаемый логин
//        String user = profilePage.getUserName();
//        //и сравниваем его с логином из файла настроек
//        Assert.assertEquals(ConfProperties.getProperty("login"), user);

    }

}
