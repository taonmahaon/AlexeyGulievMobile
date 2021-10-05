package scenarios;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import setup.BaseTest;
import setup.TestData;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "This simple test just click on the Sign In button",
          dataProvider = "nativeDataProvider", dataProviderClass = TestData.class)
    public void simpleNativeTest(String email, String username, String password, String title)
        throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPo().getWelement("regBtn").click();
        getPo().getWelement("regEmail").sendKeys(email);
        getPo().getWelement("regUserName").sendKeys(username);
        getPo().getWelement("regPassword").sendKeys(password);
        getPo().getWelement("confirmPassword").sendKeys(password);
        getPo().getWelement("agreeCheckbox").click();  /* 05.10.21 checkbox is not required and does not work.
        check the bug status on board "* link to an imaginary bug report"*/
        getPo().getWelement("newAccBtn").click();
        getPo().getWelement("loginEmail").sendKeys(email);
        getPo().getWelement("loginPass").sendKeys(password);
        getPo().getWelement("signInBtn").click();
        assertEquals(getPo().getWelement("pageTitle").getText(), (title));
    }
}
