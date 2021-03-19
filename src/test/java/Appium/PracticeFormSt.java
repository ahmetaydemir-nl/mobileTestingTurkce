package Appium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

public class PracticeFormSt extends Base {

    @Test
    public void test() throws MalformedURLException {
        AndroidDriver driver = lunchAndroid() ;
        /*
=>API Demos
=>Preference
=>9. Switch
=>checkbox secili olmali
=>ilk switch button kapali olmali (kapali  oldugunu onaylamalisiniz)
=>ikinci switch button acik olmali (acik oldugunu onaylamalisiniz)
         */
        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='9. Switch']").click();
//ilk checkbox secili olup olmadigini kontrol ediyoruz
        List<WebElement> checkBox1 = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/checkbox\").checked(false)");
        TouchAction touchAction = new TouchAction(driver);
        //eger secili degil sec, her durumda içini al assertte boş gelmesin
        if (checkBox1.size()==1) {
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(checkBox1.get(0)))).perform();
        }
        String checkBoxChecked = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/checkbox\").checked(true)").getAttribute("checked");

        //birinci switch açıksa al ve kapat
        List<WebElement> switch1 = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/switch_widget\").text(\"ON\")");
        //ikincisi switch kapalıysa al ve aç
        List<WebElement> switch2 = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/switch_widget\").text(\"NO\")");

        //eger switch1 açıksa kapat, her durumda assert için al içi boş gelmesin
        if(switch1.size()==1){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(switch1.get(0)))).perform();
        }
     //   onaylamalar burda yapilmis
        String switch1Uncheked = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/switch_widget\").text(\"OFF\")").getAttribute("text");

        //eger switch2 kapalıysa aç,  her durumda assert için al içi boş gelmesin
        if(switch2.size()==1){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(switch2.get(0)))).perform();
        }
        String switch2Checked = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/switch_widget\").text(\"YES\")").getAttribute("text");
        //checkbox'ın tikli switchlerin ilkinin kapalı ikincisinin açık olduğunu test et

        Assert.assertEquals("true",checkBoxChecked);
       // System.out.println(!(switch1.get(0).isSelected()));
        Assert.assertEquals("OFF",switch1Uncheked);
  //      System.out.println(switch2.get(0).isSelected());
        Assert.assertEquals("YES",switch2Checked);
    }
}
