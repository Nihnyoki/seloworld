package pomObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooLoginPageEvents {

    private WebDriver driver;

    public YahooLoginPageEvents(WebDriver driver){
        driver = driver;
    }

    public void enterEndPoint(String endPoint){
        driver.get(endPoint);
    }

    public WebElement findSignInBtnInHomePg(String signInBtnLoc){
        return driver.findElement(By.xpath(signInBtnLoc));
    }

    public WebElement enterEmailAddress(String emailInputField){
        return driver.findElement(By.xpath(emailInputField));
    }

    public WebElement nextBtnYahooLoginPg(String id){
        return driver.findElement(By.id(id));
    }

}
