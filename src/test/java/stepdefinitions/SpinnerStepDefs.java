package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.android.SpinnerPage;
import pages.android.ViewsPage;
import utilities.Driver;

public class SpinnerStepDefs {
 ViewsPage viewsPage = new ViewsPage();
 SpinnerPage spinnerPage = new SpinnerPage();
    @When("kullanici Spinner sayfasina gidecek")
    public void kullaniciSpinnerSayfasinaGidecek() {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))");

        viewsPage.spinner.click();

    }

    @And("ilk dropdown {string} sec ve onayla")
    public void ilkDropdownSecVeOnayla(String arg0) throws InterruptedException {
        spinnerPage.spinner1.click();
        spinnerPage.blue.click();
        Thread.sleep(3000);
        Assert.assertTrue(spinnerPage.selectedBlue.isDisplayed());
        System.out.println("blue ekran secildi.");

    }

    @And("ikin dropdown {string} sec ve onayla")
    public void ikinDropdownSecVeOnayla(String arg0) throws InterruptedException {
        spinnerPage.spinner2.click();
        spinnerPage.mars.click();
        Thread.sleep(3000);
       // Assert.assertTrue(spinnerPage.mars.isDisplayed());
    }
}
