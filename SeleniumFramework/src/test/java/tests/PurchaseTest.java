package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class PurchaseTest extends BaseTest {

    @Test
    public void purchaseProductTest() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);
        lp.login("tester143","tester");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        Assert.assertTrue(driver.findElement(By.id("nameofuser")).isDisplayed());


        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Place Order']")).click();

        driver.findElement(By.id("name")).sendKeys("Sai");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Chennai");
        driver.findElement(By.id("card")).sendKeys("123456");
        driver.findElement(By.id("month")).sendKeys("11");
        driver.findElement(By.id("year")).sendKeys("2025");

        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

        Assert.assertTrue(driver.findElement
        (By.xpath("//h2[contains(text(),'Thank you')]")).isDisplayed());
    }
}
