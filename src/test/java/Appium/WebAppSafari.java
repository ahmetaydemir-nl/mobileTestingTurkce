package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebAppSafari {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");

        IOSDriver<IOSElement> driver =  new IOSDriver<IOSElement>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://amazon.com");

        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//a[@id='nav-logobar-greeting']")));
        driver.findElementByXPath("//a[@id='nav-logobar-greeting']").click();

        String expectedText = "Welcome";
        IOSElement actualText = driver.findElementByXPath("//h2");

        Thread.sleep(5000);
        Assert.assertTrue(actualText.isDisplayed());
//Welcome text locate edilmeli
        Assert.assertEquals(expectedText,actualText.getText());



    }
}
