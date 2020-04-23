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

public class TC_06_Accounts_Master {
	WebDriver driver;
	
	@DataProvider(name="excelData_Customer_Accounts")
	public Object[][] readExcelCustomerAccounts() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet20");
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
			obj[i][8]=sheet.getRow(i+1).getCell(8).toString();
			
		}
		System.out.println("test");
		return obj;
	}
	@DataProvider(name="excelData_Vender_Accounts")
	public Object[][] readExcelVenderAccounts() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet21");
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
			obj[i][8]=sheet.getRow(i+1).getCell(8).toString();
			
		}
		System.out.println("test");
		return obj;
	}
	
  @Test(dataProvider="excelData_Customer_Accounts",priority=0,enabled=true)
  public void Create_Customer_Accounts(String code,String account,String name,String tel,String mob,String email,String address,String OB,String paymentmode) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  mstr.click_Customer_Accounts();
	  mstr.click_ADD_button();
	  mstr.Customer_AccountCreation(code, account, name, tel, mob, email, address, OB, paymentmode);
	  mstr.click_Submit();
	  Thread.sleep(6000);
	  
  }
  @Test(dataProvider="excelData_Vender_Accounts",priority=1,enabled=true)
  public void Create_Vender_Accounts(String code,String account,String name,String tel,String mob,String email,String address,String OB,String paymentmode) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  mstr.click_Vender_Accounts();
	  mstr.click_ADD_button();
	  System.out.println(OB);
	  mstr.Vender_AccountCreation(code, account, name, tel, mob, email, address, OB, paymentmode);
	  mstr.click_Submit();
	  Thread.sleep(6000);
	  
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
