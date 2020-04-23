package com.Maintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By MondayFrom=By.id("MondayFrom");
	By TuesdayFrom=By.id("TuesdayFrom");
	By WednesdayFrom=By.id("WednesdayFrom");
	By ThursdayFrom=By.id("ThursdayFrom");
	By FridayFrom=By.id("FridayFrom");
	By SaturdayFrom=By.id("SaturdayFrom");
	By SundayFrom=By.id("SundayFrom");
	
	By MondayTo=By.id("MondayTo");
	By TuesdayTo=By.id("TuesdayTo");
	By WednesdayTo=By.id("WednesdayTo");
	By ThursdayTo=By.id("ThursdayTo");
	By FridayTo=By.id("FridayTo");
	By SaturdayTo=By.id("SaturdayTo");
	By SundayTo=By.id("SundayTo");
	
	public Calendar(WebDriver driver)
	{
		
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 30);
		
	}

	public void enter_CalendarValues() throws Exception
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(MondayFrom)).sendKeys("9");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MondayFrom)).sendKeys("0");
		wait.until(ExpectedConditions.visibilityOfElementLocated(MondayTo)).sendKeys("18");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MondayTo)).sendKeys("0");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(TuesdayFrom)).sendKeys("9");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(TuesdayFrom)).sendKeys("0");
		wait.until(ExpectedConditions.visibilityOfElementLocated(TuesdayTo)).sendKeys("18");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(TuesdayTo)).sendKeys("0");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(WednesdayFrom)).sendKeys("9");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(WednesdayFrom)).sendKeys("0");
		wait.until(ExpectedConditions.visibilityOfElementLocated(WednesdayTo)).sendKeys("18");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(WednesdayTo)).sendKeys("0");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(ThursdayFrom)).sendKeys("9");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ThursdayFrom)).sendKeys("0");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ThursdayTo)).sendKeys("18");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ThursdayTo)).sendKeys("0");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(FridayFrom)).sendKeys("9");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FridayFrom)).sendKeys("0");
		wait.until(ExpectedConditions.visibilityOfElementLocated(FridayTo)).sendKeys("18");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FridayTo)).sendKeys("0");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(SaturdayFrom)).sendKeys("9");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SaturdayFrom)).sendKeys("0");
		wait.until(ExpectedConditions.visibilityOfElementLocated(SaturdayTo)).sendKeys("18");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SaturdayTo)).sendKeys("0");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(SundayFrom)).sendKeys("9");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SundayFrom)).sendKeys("0");
		wait.until(ExpectedConditions.visibilityOfElementLocated(SundayTo)).sendKeys("18");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SundayTo)).sendKeys("0");
	}
}
