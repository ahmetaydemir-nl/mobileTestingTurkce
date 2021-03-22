package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class ViewsPage {
    public ViewsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
    public WebElement dragAndDrop;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tabs']")
    public List<WebElement> tabs;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WebView']")
    public WebElement webView;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Spinner']")
    public WebElement spinner;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Expandable Lists']")
    public WebElement expandableLists;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TextSwitcher']")
    public WebElement textSwitcher;
    @AndroidFindBy (id="com.touchboarder.android.api.demos:id/next")
    public WebElement next;
    @AndroidFindBy(xpath = "//android.widget.TextView")
    public WebElement sonuc;
}
