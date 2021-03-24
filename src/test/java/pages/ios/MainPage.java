package pages.ios;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @FindBy(id = "Alert Views")
    public IOSElement alertViews;

    @FindBy(id = "Steppers")
    public IOSElement steppers;

    @FindBy(id = "Switches")
    public IOSElement switches;




}
