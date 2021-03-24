package stepdefinitions;

import io.cucumber.java.en.When;
import pages.AllPage;

public class IOSTextBoxStepDefs {
    AllPage allPage = new AllPage();

    @When("kullanici Alert Views sayfasina gider")
    public void kullanici_alert_views_sayfasina_gider() {
       allPage.mainPage().alertViews.click();
    }

    @When("kullanici Text Entery gider")
    public void kullanici_text_entery_gider() {
       allPage.alertViews().textEntery.click();
    }

    @When("kullanici {string} yazar")
    public void kullanici_yazar(String text) {
        allPage.alertViews().textBox.sendKeys(text);
    }

    @When("kullanici OK butonuna tiklar")
    public void kullanici_ok_butonuna_tiklar() {
       allPage.alertViews().OKButton.click();
    }

}
