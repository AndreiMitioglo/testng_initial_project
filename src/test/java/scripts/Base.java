package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class Base {

    WebDriver driver;
    WebDriverWait explicitWait;
    SignInValidation signInValidation;
    SocialMediaValidation socialMediaValidation;
    Test3 test3;

    @BeforeMethod
    public void setup(){
      driver = Driver.getDriver();
      explicitWait = new WebDriverWait(driver, 30);
      signInValidation = new SignInValidation();
      socialMediaValidation = new SocialMediaValidation();
      test3 = new Test3();

    }

    @AfterMethod
    public void teardown (){
        Driver.quitDriver();
    }

}
