package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignInValidation extends Base {

    @Test()
    public void signInValidation() {
        driver.get("https://www.cars.com/");
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='header-signin']"));
        signInButton.click();

        WebElement signInHeading = driver.findElement(By.xpath("//header[@role='presentation']/h1"));

        System.out.println(signInHeading.getText().equals("Sign in") ? "PASSED" : "FAILED");
    }

    @Test()
    public void newToCars() {
        driver.get("https://www.cars.com/");
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='header-signin']"));
        signInButton.click();

        WebElement newToCars = driver.findElement(By.xpath("//p[@class='sds-page-section__title--sub signup-block']"));

        System.out.println(newToCars.getText().equals("New to Cars.com? Sign up. Are you a dealer?") ? "PASSED" : "FAILED");
    }

    @Test()
    public void emailInputBox() {
        driver.get("https://www.cars.com/");
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='header-signin']"));
        signInButton.click();

        WebElement emailBox = driver.findElement(By.xpath("//div[@class='sds-input-container']"));

        System.out.println(emailBox.getText().equals("Email") ? "PASSED" : "FAILED");
        System.out.println(emailBox.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(emailBox.isDisplayed() ? "PASSED" : "FAILED");

    }

    @Test()
    public void passwordInputBox() {
        driver.get("https://www.cars.com/");
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='header-signin']"));
        signInButton.click();

        WebElement passwordBox = driver.findElement(By.name("user[password]"));

        System.out.println(passwordBox.getText().equals("Password") ? "PASSED" : "FAILED");

        System.out.println(passwordBox.isEnabled() ? "PASSED" : "FAILED");

        WebElement minOf8Chars = driver.findElement(By.xpath("//p[@class='sds-helper-text']"));
        System.out.println(minOf8Chars.getText().equals("Minimum of eight characters") ? "PASSED" : "FAILED");

        WebElement forgotPassword = driver.findElement(By.linkText("Forgot password?"));
        System.out.println(forgotPassword.getText().equals("Forgot password?") ? "PASSED" : "FAILED");

        WebElement privacy = driver.findElement(By.xpath("//div[@class='sds-disclaimer ']"));
        System.out.println(privacy.getText().equals("By signing in to your profile, you agree to our ") ? "PASSED" : "FAILED");

        WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='sds-button']"));
        System.out.println(signInButton2.isDisplayed()? "PASSED" : "FAILED");
        System.out.println(signInButton2.isEnabled()? "PASSED" : "FAILED");

        System.out.println(signInButton2.getText().equals("Sign in") ? "PASSED" : "FAILED");
    }
}