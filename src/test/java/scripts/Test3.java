package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test3 extends Base{

    @Test()
    public void Test3Validation() {
        driver.get("https://www.cars.com/");
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='header-signin']"));
        signInButton.click();

        WebElement signInHeading = driver.findElement(By.xpath("//header[@role='presentation']/h1"));
        System.out.println(signInHeading.getText().equals("Sign in") ? "PASSED" : "FAILED");

        WebElement emailBox = driver.findElement(By.xpath("//input[@class='sds-text-field']"));

        emailBox.sendKeys("johnDoe@gmail.com");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@class='sds-text-field']"));
        passwordBox.sendKeys("1234");
        WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='sds-button']"));
        signInButton2.click();


        WebElement errorMessage1 = driver.findElement(By.xpath("//div[@class='sds-notification__title']"));
        System.out.println(errorMessage1.getText().equals("We were unable to sign you in.") ? "PASSED" : "FAILED");
        WebElement errorMessage2 = driver.findElement(By.xpath("//p[@class='sds-notification__desc']"));
        System.out.println(errorMessage2.getText().equals("Your email or password was not recognized. Try again soon.") ? "PASSED" : "FAILED");
    }
}
