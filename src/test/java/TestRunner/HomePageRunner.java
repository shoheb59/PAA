package TestRunner;

import Base.Setup;
import Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageRunner extends Setup {
    HomePage homePage;

    @Test(priority = 1)
    public void selectAndInsert()
    {
        homePage = new HomePage(driver);
        driver.get("https://www.amazon.com");
        homePage.dropDownSelection();
        homePage.insertText();
    }
}
