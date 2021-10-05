package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import pageObjects.WebPageObject;

public class Crutch {
    public static WebElement crutchForSearchField(AppiumDriver driver) {
        return new WebPageObject(driver).getSearch();
    }

    public static WebElement crutchForExpectedSearchResult(AppiumDriver driver) {
        return new WebPageObject(driver).getExpectedResult();
    }
}
