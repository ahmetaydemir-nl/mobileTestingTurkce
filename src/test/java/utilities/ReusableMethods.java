package utilities;

import Appium.WebApp;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ReusableMethods {
//bu metod ile aplikasyonun her sayfasina gidebilirsiniz parametre olaak safyanin adini metoda tanimlamalisiniz
    public static void goToPage(String pageName){
        List<WebElement> pages = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView");

        for (WebElement page : pages) {
            if(page.getText().equals(pageName)){
                page.click();
                break;
            }

        }
    }
    //elementin gorunmesi bekliyecek
    public static WebElement waitFotVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(),15);
        return  wait.until(ExpectedConditions.visibilityOf(element));
    }
    //elemntin clickable oldugunu bekliyecek
    public static WebElement waitForClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(),15);
        return  wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //UiScrollable
    public static void scrollToText(String text){
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))");

        driver.findElementByXPath("//android.widget.TextView[@text='"+text+"']").click();

    }


}
