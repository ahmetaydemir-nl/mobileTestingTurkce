package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class PopupMenuPage {
 public PopupMenuPage (){
     PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
 }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Popup Menu']")
    public WebElement popupMenu;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='MAKE A POPUP!']")
    public WebElement makePopup;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add']")
    public WebElement add;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    public WebElement toast;
}
