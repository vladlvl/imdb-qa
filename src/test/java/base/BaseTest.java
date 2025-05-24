package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setUpSelenide() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
        Configuration.headless = false;
        Configuration.pageLoadStrategy = "normal";
        Configuration.baseUrl = "https://imdb.com/";
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
