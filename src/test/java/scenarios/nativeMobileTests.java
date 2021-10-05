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

}
