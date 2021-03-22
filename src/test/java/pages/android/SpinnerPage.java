package pages.android;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SpinnerPage {
    public SpinnerPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/spinner1")
    public AndroidElement spinner1;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='blue']")
    public AndroidElement blue;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/spinner2")
    public AndroidElement spinner2;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Mars']")
    public AndroidElement mars;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='blue']")
    public AndroidElement selectedBlue;



}
