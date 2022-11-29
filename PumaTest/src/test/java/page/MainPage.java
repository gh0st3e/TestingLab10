package page;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;
import waits.MyCondition;

public class MainPage {
    private static final String HOMEPAGE_URL = "https://us.puma.com/us/en";

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/nav/div/div[1]/form/div/label/input")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/nav/div/div/form/div/label/div/button/svg/use")
    private WebElement searchBtn;



    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public MainPage OpenPage(){
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public ItemsPage setText(String name) {
        searchField.click();
        searchField.sendKeys(name);
        searchField.sendKeys(Keys.ENTER);
        return new ItemsPage(driver);
    }



}
