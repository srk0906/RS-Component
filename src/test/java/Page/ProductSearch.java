package Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import junit.framework.Assert;

public class ProductSearch {

	String productTitle = null;
	static WebDriver driver = null;


	public static void setDriver() {


		System.setProperty("webdriver.chrome.driver", "E:\\Rajkannan\\WorkItems\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
	}


    public void goToHomePage() throws InvalidFormatException, IOException{
    	String URL="https://www.traceparts.com/en";
    	setDriver();
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("[class*='continue-without-agreeing']")).click();
    }

    public void SearchPhotoElectricSensor() throws Exception {
    	By By_SearchBox = By.cssSelector("#searchBox");
    	driver.findElement(By_SearchBox).sendKeys("Photoelectric sensor");
    	By By_SearchButton = By.cssSelector("#search-button");
    	driver.findElement(By_SearchButton).click();
    }

    public void ClickFirstProductAndSaveTitle()
    {
    	By By_FirstProduct = By.cssSelector("#search-results-items [class*='card-title']");
    	productTitle = driver.findElement(By_FirstProduct).getAttribute("title");
    	driver.findElement(By_FirstProduct).click();
    }

    public void VerifyProductTitle()
    {
    	By By_ProductName = By.cssSelector("#overview h1");
    	String productName = driver.findElement(By_ProductName).getText();
    	Assert.assertEquals(productName.split("-")[1].trim(), "LD46");

    }

    public void VerifyProductName()
    {
    	By By_ProductName = By.xpath("//*[@id='bomfields-listing']//tr[2]//td");
    	String productName = driver.findElement(By_ProductName).getAttribute("title");
    	Assert.assertEquals(productName, productTitle);
    }

    public void RightClickOnProductImage() throws InterruptedException
    {
    	By By_ProductImage = By.cssSelector("#overview-slider-preview");
    	Actions actions = new Actions(driver);
    	Thread.sleep(3000);
    	WebElement elementLocator = driver.findElement(By_ProductImage);
    	actions.contextClick(elementLocator).perform();
    }

    public void ClickViews()
    {
    	By By_Views = By.xpath("//*[@class='menu-text' and text()='Views']");
    	driver.findElement(By_Views).click();
    }

    public void ClickLeft()
    {
    	By By_Left = By.xpath("//*[@class='menu-text' and text()='Left']");
    	driver.findElement(By_Left).click();
    	driver.quit();
    }


}
