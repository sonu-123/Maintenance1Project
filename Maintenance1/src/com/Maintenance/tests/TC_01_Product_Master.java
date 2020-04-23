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

public class TC_01_Product_Master {
	WebDriver driver;
	
	@DataProvider(name="excelData_Product")
	public Object[][] readExcel() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
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
	@DataProvider(name="excelData_ProductCategory")
	public Object[][] readExcell() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
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
	public Object[][] readExcelBrand() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet3");
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
	
	@DataProvider(name="excelData_Model")
	public Object[][] readExcelModel() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet4");
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
	
  @Test(dataProvider="excelData_Product" ,priority=0,enabled=true)
  public void CreateProduct_Master(String name) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(2000);
	  mstr.click_Product_Product();
	  Thread.sleep(2000);
	  mstr.click_ADD_button();
	  mstr.click_Name(name);
	  mstr.click_Submit();
  }
  
  @Test(dataProvider="excelData_ProductCategory",priority=1,enabled=true)
  public void CreateProductCategory_Master(String Catgry) throws Exception
  {

	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(2000);
	  mstr.click_ProductCtgry_Product();
	  Thread.sleep(2000);
	  mstr.click_ADD_button();
	  mstr.Creation_ProductCtgry_Master();
	  mstr.click_ctgryName(Catgry);
	  mstr.click_Submit();
  }
  @Test(dataProvider="excelData_Brand" ,priority=3,enabled=true)
  public void CreateBrand_Master(String name) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(2000);
	  mstr.click_Brand_Product();
	  Thread.sleep(2000);
	  mstr.click_ADD_button();
	  mstr.click_Name(name);
	  mstr.click_Submit();
  }
  
  @Test(dataProvider="excelData_Model" ,priority=4,enabled=true)
  public void CreateModel_Master(String name) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(2000);
	  mstr.click_Model_Product();
	  Thread.sleep(2000);
	  mstr.click_ADD_button();
	  mstr.click_ctgryName(name);
	  mstr.Creation_Model_Master();
	  mstr.click_Submit();
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
	  
	  driver.close();
  }

}
