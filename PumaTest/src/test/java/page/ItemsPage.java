package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ItemsPage {
    private final int WAIT_TIME_IN_SECONDS = 30;

    private final WebDriver driver;

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div/section/nav[1]/div/div/div/div[1]/div[2]/div/div[2]/button")
    private WebElement categoryList;

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div/section/nav[1]/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/label[3]")
    private WebElement accessoryCategory;

    @FindBy(xpath = "//*[@id=\"product-list-items\"]/li[1]/div[1]/a/div[1]/img")
    private WebElement firstItem;

    public ItemsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, WAIT_TIME_IN_SECONDS), this);
    }

    public void setAcsessories(){
        categoryList.click();
        accessoryCategory.click();
    }

    public void chooseItem(){
        firstItem.click();
    }
}
