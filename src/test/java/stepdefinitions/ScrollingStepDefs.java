package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import pages.android.ViewsPage;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class ScrollingStepDefs {
    List<WebElement> items;
    ViewsPage viewsPage = new ViewsPage();
    @Given("kullanici Tabs sayfasina gidecek")
    public void kullaniciTabsSayfasinaGidecek() throws InterruptedException {
      // List<WebElement> items;
        do {
            items = viewsPage.tabs;
            //element DOM da gorunmedigi icin size 0 consolda gorunen ilk sifir burdan
            //element DOM da gorunmedigi icin size 0 consolda gorunen ikinci sifir burdan
            System.out.println(items.size());
            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
            int start_x = (int) (dimension.height * 0.5);
            int start_y = (int) (dimension.height * 0.8);
            int end_x = (int) (dimension.width * 0.5);
            int end_y = (int) (dimension.width * 0.2);

            TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

            touchAction.press(PointOption.point(start_x, start_y)).
                    waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                    moveTo(PointOption.point(end_x, end_y)).release().perform();
            Thread.sleep(2000);
            //size 0 oldugu icin do - while calisiyor
            //element DOM da mevcut size 1 oldu loop tan cikar
            System.out.println(items.size());
        }while (items.size()==0);
        //console daki ikinci 1 burdan geliyor elementin gorundugunu burdan anliyoruz
        System.out.println("loop disi " + items.size());
        //eger element goruyorsa o element e tikla
        if(items.size()>0){
            items.get(0).click();
        }
    }

    @Given("kullanici  webview sayfasina gidecek")
    public void kullaniciWebviewSayfasinaGidecek() {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");

        viewsPage.webView.click();

    }

    @Then("kullanici textswitcher secenegini secer")
    public void kullaniciTextswitcherSeceneginiSecer() {
        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();//UiScrollable özelliği Android de çalışır yalnızca
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextSwitcher\"))");
        viewsPage.textSwitcher.click();
    }
    @And("kullanıcı next butonuna iki kez tiklar")
    public void kullanıcıNextButonunaIkiKezTiklar() {
        viewsPage.next.click();
        viewsPage.next.click();
    }
    @And("sayinin iki oldugunu verify edin")
    public void sayininIkiOldugunuVerifyEdin() {
        Assert.assertTrue(viewsPage.sonuc.getText().equals("2"));
    }

}
