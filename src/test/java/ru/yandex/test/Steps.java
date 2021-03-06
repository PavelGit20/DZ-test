package ru.yandex.test;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver chromeDriver;

    @Step
    public void открытьХром() {
        System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Step
    public void закрытьХром() {
        chromeDriver.quit();
    }
}
