package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class DragAndDropPage {
    public DragAndDropPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_1")
    public WebElement Nokta1;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_2")
    public WebElement Nokta2;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_3")
    public WebElement Nokta3;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_hidden")
    public WebElement Nokta4;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_text")
    public WebElement actualText;



}
