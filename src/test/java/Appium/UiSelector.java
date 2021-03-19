package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class UiSelector {
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
        // desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/mehmetaliayyildiz/IdeaProjects/mobileTestingTurkce/src/Apps/GestureTool.apk");
        desiredCapabilities.setCapability("appPackage", "com.davemac327.gesture.tool");
        desiredCapabilities.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);

        //UiSelector
        //UiSelector ' kabul etmiyor "" kullanmak gerekiyor
       // driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"<value>\")");

        driver.findElementById("com.davemac327.gesture.tool:id/addButton");
        //UiSelector resourceId
       // driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\")").click();

        //UiSelector className
      //  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(2)").click();

        //elementin ozelliklerini kontrol etme clickable?  checkable?
        System.out.println("clickable " +driver.findElementByAndroidUIAutomator(" new UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\").clickable(true)").getAttribute("clickable"));

        System.out.println("clickable " +driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\").checkable(false)").getAttribute("checkable"));

      //  https://developer.android.com/reference/androidx/test/uiautomator/UiSelector
    }
}
