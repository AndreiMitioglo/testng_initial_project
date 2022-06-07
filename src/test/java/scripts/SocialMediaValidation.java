package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SocialMediaValidation extends Base{

@Test
    public void social() {
        driver.get("https://www.cars.com/");
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='header-signin']"));
        signInButton.click();

        WebElement signInHeading = driver.findElement(By.xpath("//header[@role='presentation']/h1"));

        System.out.println(signInHeading.getText().equals("Sign in") ? "PASSED" : "FAILED");

    WebElement connectWhitSocial = driver.findElement(By.xpath("//h3[@class='social-title sds-heading--3']"));
    System.out.println(connectWhitSocial.getText().equals("Connect with social") ? "PASSED" : "FAILED");

    WebElement sighInFacebook = driver.findElement(By.xpath("//a[@class='sds-button facebook-button']"));
    System.out.println(sighInFacebook.getText().equals("Sign in with Facebook") ? "PASSED" : "FAILED");
    System.out.println(sighInFacebook.isEnabled()? "PASSED" : "FAILED");
    System.out.println(sighInFacebook.isDisplayed()? "PASSED" : "FAILED");

    WebElement sighInGoogle = driver.findElement(By.xpath("//a[@class='sds-button google-button']"));
    System.out.println(sighInGoogle.getText().equals("Sign in with Google") ? "PASSED" : "FAILED");
    System.out.println(sighInGoogle.isEnabled()? "PASSED" : "FAILED");
    System.out.println(sighInGoogle.isDisplayed()? "PASSED" : "FAILED");

    WebElement sighInApple = driver.findElement(By.xpath("//a[@class='sds-button apple-button']"));
    System.out.println(sighInApple.getText().equals("Sign in with Apple") ? "PASSED" : "FAILED");
    System.out.println(sighInApple.isEnabled()? "PASSED" : "FAILED");
    System.out.println(sighInApple.isDisplayed()? "PASSED" : "FAILED");

    }

}
