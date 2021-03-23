package stepdefinitions;

import io.cucumber.java.en.When;
import utilities.ReusableMethods;

public class KullanilabilirMethodStepDefs {

    @When("kullanici {string} sayfasina gidecek")
    public void kullanici_sayfasina_gidecek(String pageName) {
        ReusableMethods.goToPage(pageName);
    }

    @When("kullanici {string} scroll yapacak")
    public void kullaniciScrollYapacak(String text) {
        ReusableMethods.scrollToText(text);
    }


}
