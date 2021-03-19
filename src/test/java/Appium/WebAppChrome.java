package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class WebAppChrome {

    @Test
            public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        desiredCapabilities.setCapability("chromedriverExecutable","/Users/mehmetaliayyildiz/IdeaProjects/mobileTestingTurkce/driver/chromedriver");
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

        driver.get("https://facebook.com");

        //suan hangi gorunumde
        System.out.println("Suan ki durum "+driver.getContext());

       //app gorunumu degistirme metodu

        Set contexts = driver.getContextHandles();
        for (Object contextName : contexts) {
            System.out.println(contextName);
            Thread.sleep(5000);
            if (contextName.toString().contains("CHROMIUM")) {
                driver.context((String) contextName);
            }
        }

        System.out.println("son durum "+driver.getContext());
        /*
        kullanici adi gir "ali"
        sifre "veli"
        login / giris tusuna
         */
        driver.findElementByXPath("//*[@id='accept-cookie-banner-label']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//input[@name='email']").sendKeys("ali");
        Thread.sleep(3000);
        driver.findElementByXPath("//input[@name='pass']").sendKeys("veli");
        Thread.sleep(3000);
        driver.findElementByXPath("//button[@name='login']").click();


    }
}
