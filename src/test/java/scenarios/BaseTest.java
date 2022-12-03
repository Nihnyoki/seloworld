package scenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomObjects.IYahoo;
import utils.Operations;

public class BaseTest {

    static WebDriver driver = null;

    @BeforeTest
    public void beforeTest() {
        Operations ops = new Operations();
       driver = ops.startBrowser(IYahoo.browserA);
    }

    @AfterTest
    public void afterTestMethod() {
        driver.quit();
    }
}
