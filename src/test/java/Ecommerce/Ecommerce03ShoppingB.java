package Ecommerce;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ecommerce03ShoppingB {

    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/mehmetaliayyildiz/IdeaProjects/mobileTestingTurkce/src/Apps/General-Store.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();

        Thread.sleep(3000);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Azerbaijan\"))");
        driver.findElementByXPath("//*[@text='Azerbaijan']").click();

        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Appium");

        //klavye yi kaldir
        driver.hideKeyboard();

       driver.findElementById("com.androidsample.generalstore:id/radioMale").click();

       driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

      //2. sayfa
        /*
        3-Validate if the items selected in the page 2 are matching with the items displayed in check out page
3-iki urun sec ve secilen urunleri seppette gor

b)iki urunu sec (Air Jordan 4 Retro, Jordan Lift Off)
         */

        //1. YOL:
// ilk ayakkabi yi sectik
      //  driver.findElementsByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\"))");
        driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();






    }
}
