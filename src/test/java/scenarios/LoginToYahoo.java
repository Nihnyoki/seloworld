package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomObjects.IYahoo;
import pomObjects.YahooLoginPageEvents;
import utils.Operations;

public class LoginToYahoo extends  BaseTest {
    WebDriver driver;
    YahooLoginPageEvents ylpg;

    @BeforeTest
    public void beforeTestMethod(){
        Operations ops = new Operations();
        driver = ops.startBrowser(IYahoo.browserA);
    }

    @Test
    public void loginToYahoo() throws InterruptedException {
        ylpg = new YahooLoginPageEvents(driver);
        ylpg.enterEndPoint(IYahoo.url);
        ylpg.findSignInBtnInHomePg(IYahoo.signInBtnLoc_xp).click();
        ylpg.enterEmailAddress(IYahoo.emailInputField_xp).sendKeys("sandile.mnqayi@yahoo.com");
        ylpg.nextBtnYahooLoginPg(IYahoo.loginPgNextBtn_Id).click();
        driver.manage().wait(10000);
    }
}