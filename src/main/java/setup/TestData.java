package setup;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "nativeDataProvider")
    public static Object[][] nativeDataProvider() {
    return new Object[][] {{"email@emap.com", "username", "password", "BudgetActivity"}};
    }

    public static String[] SEARCH_PAGE =  {"https://www.google.com/", "Google"};
}
