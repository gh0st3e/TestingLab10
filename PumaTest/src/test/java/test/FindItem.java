package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.ItemsPage;
import page.MainPage;

public class FindItem {
    private WebDriver driver;

    private ItemsPage itemsPage;

    @BeforeMethod(alwaysRun = true)
    public void driverSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void SearchItem(){
        MainPage mainPage = new MainPage(driver);
        mainPage.OpenPage();
        itemsPage = mainPage.setText("Basketbal");
        itemsPage.setAcsessories();
        itemsPage.chooseItem();
    }

//    @AfterMethod(alwaysRun = true)
//    public void browserTearDown() {
//        driver.quit();
//        driver = null;
//    }
}
