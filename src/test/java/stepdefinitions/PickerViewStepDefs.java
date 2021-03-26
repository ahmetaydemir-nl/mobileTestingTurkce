package stepdefinitions;

import io.cucumber.java.en.When;
import pages.AllPage;

public class PickerViewStepDefs {
    AllPage allPage = new AllPage();

    @When("kullanici Picker View sayfasina gidecek")
    public void kullanici_picker_view_sayfasina_gidecek() {
         allPage.mainPage().pickerView.click();
    }

    @When("ilk kolona {string} girilecek")
    public void ilk_kolona_girilecek(String ilkDeger) {
      allPage.pickerViewPage().firstPicker.sendKeys(ilkDeger);
    }

    @When("ikinci kolona {string} girilecek")
    public void ikinci_kolona_girilecek(String ikinciDeger) {
        allPage.pickerViewPage().secondPicker.sendKeys(ikinciDeger);
    }

    @When("ucuncu kolona {string} girilecek")
    public void ucuncu_kolona_girilecek(String ucuncuDeger) {
       allPage.pickerViewPage().thirdPicker.sendKeys(ucuncuDeger);
    }

}
