package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.android.ApiDemosPage;
import pages.android.DragAndDropPage;
import pages.android.ViewsPage;
import utilities.Driver;

public class DragAndDropStepDefs {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    ViewsPage viewsPage = new ViewsPage();
    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Given("kullanici Views sayfasina gidecek")
    public void kullanici_views_sayfasina_gidecek() {
        apiDemosPage.views.click();
    }

    @Given("kullanici drag and drop sayfasina gidecek")
    public void kullanici_drag_and_drop_sayfasina_gidecek() {
       viewsPage.dragAndDrop.click();
    }

    @Given("kullanici ilk butonu alip ikici butona koyacak")
    public void kullanici_ilk_butonu_alip_ikici_butona_koyacak() {
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

        touchAction.longPress(ElementOption.element(dragAndDropPage.Nokta1)).
                moveTo(ElementOption.element(dragAndDropPage.Nokta2)).release().perform();
    }

    @Then("text onayliyacak")
    public void text_onayliyacak() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(dragAndDropPage.actualText.isDisplayed());
    }


}
