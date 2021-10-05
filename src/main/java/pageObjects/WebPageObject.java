package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPageObject  {

    public WebPageObject(AppiumDriver<WebElement> appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

}
