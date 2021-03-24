package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Arama {
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

        desiredCapabilities.setCapability("appPackage", "com.google.android.dialer");
        desiredCapabilities.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

        /*
        arama ac
        tuslara ulasalim
        112 ara
        sonra aramayi sonlandir
         */

        driver.findElementById("com.google.android.dialer:id/dialpad_fab").click();
        Thread.sleep(3000);

        WebElement num1 = driver.findElementById("com.google.android.dialer:id/one");
        WebElement num2 = driver.findElementById("com.google.android.dialer:id/two");

        num1.click();
        num1.click();
        num2.click();
        Thread.sleep(2000);

        driver.findElementById("com.google.android.dialer:id/dialpad_voice_call_button").click();

        Thread.sleep(3000);

        driver.findElementById("com.google.android.dialer:id/incall_end_call").click();


         //app kapat
        driver.quit();
    }
}
