package com.qa.Test4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// System.setProperty("webdriver.gecko.driver", "C:\\Program
	// Files\\geckodriver\\geckodriver.exe");
	// WebDriver driver = new FirefoxDriver();

	driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	// driver.get("https://opensource-demo.orangehrmlive.com");

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	// driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

	// System.out.println(driver.getTitle());

	// using xpath

	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("vijay");
	driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("sharma");
	driver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).click();
	driver.findElement(By.xpath("//input[@id='exp-6']")).click();
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15-02-1980");

	driver.findElement(By.xpath("//input[@id='tool-2']")).click();
	driver.findElement(By.xpath("//input[@id='profession-1']")).click();
	WebElement productdropdown = driver.findElement(By.id("continents"));
	Select se = new Select(productdropdown);
	se.selectByVisibleText("South America");
	WebElement sedropdown = driver.findElement(By.id("selenium_commands"));
	Select se1 = new Select(sedropdown);
	se1.selectByVisibleText("Wait Commands");
	}
}
