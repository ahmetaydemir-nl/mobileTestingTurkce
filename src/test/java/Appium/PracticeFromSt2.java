package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

public class PracticeFromSt2 extends Base {
    /*
    =>API Demos
=>Preference
=>9. Switch
=>checkbox secili olmali
=>ilk switch button kapali olmali (kapali  oldugunu onaylamalisiniz)
=>ikinci switch button acik olmali (acik oldugunu onaylamalisiniz)
*/
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = lunchAndroid();
        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='9. Switch']").click();
        List<WebElement> checkBox1 = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/checkbox\").checked(false)");
        System.out.println(checkBox1.size());
        if (checkBox1.size()>0){
            checkBox1.get(0).click();
        }
        WebElement switchButton1=driver.findElementByXPath("(//android.widget.LinearLayout/android.widget.Switch)[1]");
        if(switchButton1.getText().equals("ON")){
            switchButton1.click();
        }
        Assert.assertEquals("OFF",switchButton1.getText());

        WebElement switchButton2=driver.findElementByXPath("(//android.widget.LinearLayout/android.widget.Switch)[2]");
        if(switchButton2.getText().equals("NO")){
            switchButton2.click();
        }
        Assert.assertEquals("YES",switchButton2.getText());
    }
}
