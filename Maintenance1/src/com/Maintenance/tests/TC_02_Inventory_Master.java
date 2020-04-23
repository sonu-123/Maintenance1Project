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

public class TC_02_Inventory_Master {
	WebDriver driver;
	@DataProvider(name="excelData_Category")
	public Object[][] readExcelCtgry_Inventory() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet5");
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
	@DataProvider(name="excelData_Brand")
	public Object[][] readExcelBrand_Inventory() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet6");
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
	@DataProvider(name="excelData_UOM")
	public Object[][] readExcelUOM_Inventory() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet7");
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
	@DataProvider(name="excelData_SpareParts")
	public Object[][] readExcelSpare_Inventory() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet8");
		int totalRows=sheet.getLastRowNum();
		int totalColums=sheet.getRow(0).getPhysicalNumberOfCells();
		
		// Read data from excel and store the same in the Object Array.
		Object obj[][]=new Object[totalRows][totalColums];
		for(int i=0;i<totalRows;i++)
		{
			obj[i][0]=sheet.getRow(i+1).getCell(0).toString();
			obj[i][1]=sheet.getRow(i+1).getCell(1).toString();
			obj[i][2]=sheet.getRow(i+1).getCell(2).toString();
			obj[i][3]=sheet.getRow(i+1).getCell(3).toString();
			obj[i][4]=sheet.getRow(i+1).getCell(4).toString();
			obj[i][5]=sheet.getRow(i+1).getCell(5).toString();
			obj[i][6]=sheet.getRow(i+1).getCell(6).toString();
			obj[i][7]=sheet.getRow(i+1).getCell(7).toString();
			
		}
		System.out.println("test");
		return obj;
	}
  @Test(dataProvider="excelData_Category",priority=0,enabled=true)
  public void CreateCtgry_Inventory(String name) throws Exception {
	  
	 Master mstr=new Master(driver);
	 mstr.click_Masters();
	 Thread.sleep(2000);
	 mstr.clickCtgry_Inventory();
	 Thread.sleep(2000);
	 mstr.click_ADD_button();
	 mstr.click_Name(name);
	 mstr.click_Submit();
	 
	  
  }
  @Test(dataProvider="excelData_Brand",priority=1,enabled=true)
  public void CreateBrand_Inventory(String name) throws Exception {
	  
	 Master mstr=new Master(driver);
	 mstr.click_Masters();
	 Thread.sleep(2000);
	 mstr.clickBrand_Inventory();
	 Thread.sleep(2000);
	 mstr.click_ADD_button();
	 mstr.click_Name(name);
	 mstr.click_Submit();
	 
	  
  }
  @Test(dataProvider="excelData_UOM",priority=2,enabled=true)
  public void CreateUOM_Inventory(String name) throws Exception {
	  
	 Master mstr=new Master(driver);
	 mstr.click_Masters();
	 Thread.sleep(2000);
	 mstr.clickUOM_Inventory();
	 Thread.sleep(2000);
	 mstr.click_ADD_button();
	 mstr.click_Name(name);
	 mstr.click_Submit();
	 
	  
  }
  
  
  @Test(dataProvider="excelData_SpareParts",priority=3,enabled=true)
  public void CreateSpare_Inventory(String name,String msl,String mxSL,String ROL,String ROQ,String Barcode,String Cost,String Rate) throws Exception {
	  
	 Master mstr=new Master(driver);
	 mstr.click_Masters();
	 Thread.sleep(2000);
	 mstr.clickSpareParts_Inventory();
	 Thread.sleep(2000);
	 mstr.click_ADD_button();
	 mstr.click_Name(name);
	 mstr.Creation_SpareParts_Inventory(msl,mxSL,ROL,ROQ,Barcode,Cost,Rate);
	 mstr.click_Submit();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium IDE\\Driver\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://213.136.84.57:4240/");
  }

  @AfterClass
  public void afterClass() {
	driver.close();
  }

}
