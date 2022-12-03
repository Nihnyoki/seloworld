package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.time.Duration;
import java.time.chrono.ChronoLocalDate;

public class Operations {
    WebDriver driver;

    public WebDriver startBrowser(String browser) {
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ File.separator
                        + "drivers" + File.separator + "chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("Start-Maximized");
                chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(10));
                driver = new ChromeDriver();

                return driver;

            case "fireFox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ File.separator
                        + "drivers" + File.separator + "geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("Start-Maximized");
                driver = new FirefoxDriver();
                return driver;
        }
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("Start-Maximized");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(String type, String locator){

        switch (type){
            case "ID":
                return driver.findElement(By.id(locator));
            case "XPATH":
                return driver.findElement(By.xpath(locator));
            default:
                return null;
        }
    }

    public void enterEndPoint(String url) {
        driver.get(url);
    }

}