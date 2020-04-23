package com.Maintenance.tests;

import org.testng.annotations.Test;

import com.Maintenance.Master;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TC_04_Maintenance_Master {
	WebDriver driver;
	@DataProvider(name="excelData_ServiceCategory")
	public Object[][] readExcelServiceCategry_Maintenance() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet15");
		int totalRows=sheet.getLastRowNum();
		int totalColums=sheet.getRow(0).getPhysicalNumberOfCells();
		
		// Read data from excel and store the same in the Object Array.
		Object obj[][]=new Object[totalRows][totalColums];
		for(int i=0;i<totalRows;i++)
		{
			obj[i][0]=sheet.getRow(i+1).getCell(0).toString();
			
		}
		System.out.println("test");
		return obj;
	}
	@DataProvider(name="excelData_ComplaintType")
	public Object[][] readExcelComplaintType_Maintenance() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet16");
		int totalRows=sheet.getLastRowNum();
		int totalColums=sheet.getRow(0).getPhysicalNumberOfCells();
		
		// Read data from excel and store the same in the Object Array.
		Object obj[][]=new Object[totalRows][totalColums];
		for(int i=0;i<totalRows;i++)
		{
			obj[i][0]=sheet.getRow(i+1).getCell(0).toString();
			
		}
		System.out.println("test");
		return obj;
	}
  @Test(dataProvider="excelData_ServiceCategory",priority=0,enabled=true)
  public void Create_ServiceCategory_Maintenance(String name) throws Exception 
  {
	Master mstr=new Master(driver);
	mstr.click_Masters();
	Thread.sleep(1000);
	mstr.click_ServiceCategory_Maitenance();
	mstr.click_ADD_button();
	mstr.click_Name(name);
	Thread.sleep(1000);
	mstr.click_Submit();
	Thread.sleep(5000);
  }
  
  @Test(dataProvider="excelData_ComplaintType",priority=1,enabled=true)
  public void Create_ComplaintType_Maintenance(String name) throws Exception 
  {
	Master mstr=new Master(driver);
	mstr.click_Masters();
	Thread.sleep(1000);
	mstr.click_ComplaintType_Maitenance();
	mstr.click_ADD_button();
	mstr.click_Name(name);
	mstr.Create_ComplaintType_Maintenance();
	mstr.click_ComplaintType_Submit();
	Thread.sleep(5000);
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium IDE\\Driver\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://213.136.84.57:4240/");
  }

  @AfterClass
  public void afterClass() {
  }

}
