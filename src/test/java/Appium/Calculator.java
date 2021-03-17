package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

//        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");
//        desiredCapabilities.setCapability("platformName","Android");

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        // desiredCapabilities.setCapability("automationName","UiAutomator2");

        desiredCapabilities.setCapability("appPackage", "com.miui.calculator");
        desiredCapabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);
        WebElement num1 = driver.findElementById("com.miui.calculator:id/btn_1_s");
        WebElement num2 = driver.findElementById("com.miui.calculator:id/btn_2_s");
        WebElement num3 = driver.findElementById("com.miui.calculator:id/btn_3_s");
        WebElement num4 = driver.findElementById("com.miui.calculator:id/btn_4_s");
        WebElement num5 = driver.findElementById("com.miui.calculator:id/btn_5_s");
        WebElement num6 = driver.findElementById("com.miui.calculator:id/btn_6_s");
        WebElement num7 = driver.findElementById("com.miui.calculator:id/btn_7_s");
        WebElement num8 = driver.findElementById("com.miui.calculator:id/btn_8_s");
        WebElement num9 = driver.findElementById("com.miui.calculator:id/btn_9_s");
        WebElement num0 = driver.findElementById("com.miui.calculator:id/btn_0_s");
        WebElement plus = driver.findElementById("com.miui.calculator:id/btn_plus_s");
        WebElement minus = driver.findElementById("com.miui.calculator:id/btn_minus_s");
        WebElement mul = driver.findElementById("com.miui.calculator:id/btn_mul_s");
        WebElement div = driver.findElementById("com.miui.calculator:id/btn_div_s");
        WebElement equal = driver.findElementById("com.miui.calculator:id/btn_equal_s");

        //35+24=59

        num3.click();//3
        num5.click();//5
        plus.click();//+
        num2.click();//2
        Thread.sleep(2000);
        num4.click();//4
        Thread.sleep(2000);

        WebElement preResult = driver.findElementById("com.miui.calculator:id/result");
        String exPreResult = "= 59";

        equal.click(); //=
        Thread.sleep(2000);
        WebElement acResult = driver.findElementById("com.miui.calculator:id/result");

        Assert.assertEquals(exPreResult,acResult.getText());

        Thread.sleep(3000);

        //close app
        driver.quit();


    }
}
