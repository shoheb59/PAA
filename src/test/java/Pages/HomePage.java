package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    @FindBy(id = "searchDropdownBox")
    public WebElement dd_SearchBox;

    @FindBy(id = "twotabsearchtextbox")
            public WebElement editText_SearchBox;
    @FindBy(id = "nav-search-submit-button")
            public WebElement btn_Search;



    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void dropDownSelection()
    {
        Select select = new Select(dd_SearchBox);
        select.selectByVisibleText("Baby");
    }

    public void insertText()
    {
        editText_SearchBox.sendKeys("bag");
        btn_Search.click();

    }
}
