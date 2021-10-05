package scenarios;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static setup.TestData.SEARCH_PAGE;
import static utils.Crutch.crutchForExpectedSearchResult;
import static utils.Crutch.crutchForSearchField;

import java.util.Locale;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import setup.BaseTest;

public class webMobileTests extends BaseTest {


    @Test(groups = {"web"}, description = "Make sure that we've opened IANA homepage")
    public void simpleWebTest()
        throws InterruptedException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        getDriver().get(SEARCH_PAGE[0]);

        new WebDriverWait(getDriver(), 30).until(
            wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );

        assertEquals(((WebDriver) getDriver()).getTitle().toLowerCase(Locale.ROOT),
            SEARCH_PAGE[1].toLowerCase(Locale.ROOT), String.format("Not a %s page", SEARCH_PAGE[0]));

        /* TODO: NPE... something is wrong with the initialization
        getPo().getWelement("search").sendKeys("epam", Keys.ENTER);
        assertTrue(getPo().getWelement("expectedResult").isDisplayed());*/
        crutchForSearchField(getDriver()).sendKeys("epam", Keys.ENTER);
        assertTrue(crutchForExpectedSearchResult(getDriver()).isDisplayed(), "No one relevant result");
    }
}
