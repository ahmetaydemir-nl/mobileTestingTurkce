package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.android.ExpandableListPage;
import pages.android.PopupMenuPage;
import pages.android.ViewsPage;
import utilities.Driver;

public class PopUpToastStepDefs {
    ViewsPage viewsPage = new ViewsPage();
    ExpandableListPage expandableListPage = new ExpandableListPage();
    PopupMenuPage popupMenuPage = new PopupMenuPage();
    @When("kullanici Expandable Lits sayfasina gidecek")
    public void kullanici_expandable_lits_sayfasina_gidecek() {
       viewsPage.expandableLists.click();
    }

    @When("kullanici Custom Adapter sayfasina gidecek")
    public void kullanici_custom_adapter_sayfasina_gidecek() {
      expandableListPage.customAdapter.click();
    }

    @When("kulanici People Names basili tutacak ve popup acilacak")
    public void kulanici_people_names_basili_tutacak_ve_popup_acilacak() {
        TouchAction action = new TouchAction(Driver.getAppiumDriver());
        action.longPress(ElementOption.element(expandableListPage.peopleNames)).perform();

        Assert.assertTrue(expandableListPage.sampleAction.isDisplayed());
    }

    @When("kullanici Simple action tiklayacak")
    public void kullanici_simple_action_tiklayacak() {
        expandableListPage.sampleAction.click();
    }

    @Then("Tost mesaj {string} icerdigini onayla")
    public void tost_mesaj_icerdigini_onayla(String toastText) {
        System.out.println(expandableListPage.toastMessage.getAttribute("name"));
        Assert.assertTrue(expandableListPage.toastMessage.getAttribute("name").contains(toastText));
    }

    @When("kullanici Popup Menu sayfasina gidecek")
    public void kullaniciPopupMenuSayfasinaGidecek() {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"))");

        popupMenuPage.popupMenu.click();


    }

    @When("kullanici Make a popup butonuna tikliyacak ve popup gorecek")
    public void kullaniciMakeAPopupButonunaTikliyacakVePopupGorecek() {
        popupMenuPage.makePopup.click();

        Assert.assertTrue(popupMenuPage.add.isDisplayed());
    }

    @When("kullanici Add butonuna basacak")
    public void kullaniciAddButonunaBasacak() {
        popupMenuPage.add.click();
    }

    @Then("toast mesaji onayliyacak {string}")
    public void toastMesajiOnayliyacak(String toastText) {
        System.out.println(popupMenuPage.toast.getAttribute("name"));

        Assert.assertEquals(toastText,popupMenuPage.toast.getAttribute("name"));

    }
}
