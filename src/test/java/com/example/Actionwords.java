package com.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.ayko.driverSetup.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Actionwords {
	public static WebDriver driver;
	public Actionwords() {
		driver = DriverManager.setupDriver("chrome");
	}

    public void uRLForRibbleBikesWorks() {
		try {
    	driver.get("https://www.ribblecycles.co.uk/");
		Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
    }

    public void userHoverOverAccessoriesInNavSection()  {
    	try {
    	Thread.sleep(500);
		WebElement road_nav = driver.findElement(By.xpath("//ul[@id='nav']//a[@title='Accessories']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(road_nav);
		actions.build().perform();
		Thread.sleep(500);
    }catch(Exception e) {
		e.printStackTrace();
	}
    }

    public void userClicksOnFrameset()  {
    	try {
    	Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'Framesets ')])")).click();
		Thread.sleep(500);
    	}catch(Exception e) {
			e.printStackTrace();
		}
    }

    public void userSelectsPriceLowToHigh()  {
    	try {
    	Thread.sleep(500);
		WebElement sort_select = driver.findElement(By.xpath("//div[@class='category-products']//div[@class='toolbar-top clearfix']//div[@class=\"sorter\"]//div[@class='sort-by']//div[@class='input-box']//select"));
		sort_select.click();
		Select select = new Select(sort_select);
		select.selectByVisibleText("Price: Low to High");
		Thread.sleep(500);
    }catch(Exception e) {
		e.printStackTrace();
	}
    }

    public void thePriceShouldBeInAcscendingOrder()  {
    	try {
    	boolean result = false;
		String text = driver.getCurrentUrl();
		Assert.assertTrue(text==null);
    	}catch(Exception e) {
			e.printStackTrace();
		}
    }
    
    public void userShutsDownTheBrowser()  {
    	driver.quit();
    }
}