package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPageObject  {
    @FindBy(css = "input[name='q']")
    WebElement search;

    @FindBy(xpath = "//span[contains(text(),'epam.com')]")
    WebElement expectedResult;

    public WebPageObject(AppiumDriver<WebElement> appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

    public WebElement getSearch() {
        return search;
    }

    public WebElement getExpectedResult() {
        return expectedResult;
    }

}
