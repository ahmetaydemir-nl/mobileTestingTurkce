package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class WebApp {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        desiredCapabilities.setCapability("chromedriverExecutable", "/Users/mehmetaliayyildiz/IdeaProjects/mobileTestingTurkce/driver/chromedriver");
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
       /*
       etsy.com git
       sign in tikla
       Sign in continue onayla
       */
        driver.get("https://etsy.com");

        //WEBVIEW degistelim
        Set contexts = driver.getContextHandles();
        for (Object contextName : contexts) {
            System.out.println(contextName);
            Thread.sleep(5000);
            if (contextName.toString().contains("CHROMIUM")) {
                driver.context((String) contextName);
            }
        }
//elementin UI da gorunup gorunmemesine gore dinamik bir kod (eger ui da gorunuyorsa tikla )
      if(driver.findElementsByXPath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']").size()>0){
          driver.findElementsByXPath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']").get(0).click();
     }

        driver.findElementByXPath("//a[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1']").click();
        Thread.sleep(3000);
        WebElement actualText = driver.findElementByXPath("(//h1)[2]");
        String expectedText = "Sign in to continue";

        Assert.assertEquals(expectedText,actualText.getText());
    }
}
