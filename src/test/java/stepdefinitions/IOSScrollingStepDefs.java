package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPage;
import utilities.Driver;

import java.util.HashMap;

public class IOSScrollingStepDefs {
    AllPage allPage = new AllPage();

    @When("kullanici Switches sayfasina gider")
    public void kullanici_switches_sayfasina_gider() {
        HashMap<String,Object> scrollObject = new HashMap<>();

        scrollObject.put("direction","down");
        scrollObject.put("value","Switches");

        Driver.getAppiumDriver().executeScript("mobile:scroll",scrollObject);

       allPage.mainPage().switches.click();
    }

    @When("ilk switch butonu acik olmali")
    public void ilkSwitchButonuAcikOlmali() {
        if(allPage.switchesPage().switch1.getAttribute("value").equals("0")) {
            allPage.switchesPage().switch1.click();
        }
    }

    @When("ikinci switch butonu kapali olmali")
    public void ikinciSwitchButonuKapaliOlmali() {
        if(allPage.switchesPage().switch2.getAttribute("value").equals("1")){
            allPage.switchesPage().switch2.click();
        }
    }

    @Then("bunlari onayla")
    public void bunlariOnayla() {
        Assert.assertTrue(allPage.switchesPage().switch1.getAttribute("value").equals("1"));
        Assert.assertEquals("0", allPage.switchesPage().switch2.getAttribute("value"));
    }
}
