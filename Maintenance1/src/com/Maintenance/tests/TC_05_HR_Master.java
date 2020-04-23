package com.Maintenance.tests;

import org.testng.annotations.Test;

import com.Maintenance.Calendar;
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

public class TC_05_HR_Master {
	WebDriver driver;
	
	@DataProvider(name="excelData_Designation_HR")
	public Object[][] readExcelDesignation() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet17");
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
	@DataProvider(name="excelData_AddDed_HR")
	public Object[][] readExcelAddDed() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet18");
		int totalRows=sheet.getLastRowNum();
		int totalColums=sheet.getRow(0).getPhysicalNumberOfCells();
		
		// Read data from excel and store the same in the Object Array.
		Object obj[][]=new Object[totalRows][totalColums];
		for(int i=0;i<totalRows;i++)
		{
			obj[i][0]=sheet.getRow(i+1).getCell(0).toString();
			obj[i][1]=sheet.getRow(i+1).getCell(1).toString();
			
		}
		System.out.println("test");
		return obj;
	}
	@DataProvider(name="excelData_Employee_HR")
	public Object[][] readExcelEmployee() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet19");
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
			obj[i][9]=sheet.getRow(i+1).getCell(9).toString();
			
		}
		System.out.println("test");
		return obj;
	}
  @Test(dataProvider="excelData_Designation_HR",priority=0,enabled=false)
  public void Create_Designation_HR(String name) throws Exception
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(1000);
	  mstr.click_Designation_HR();
	  mstr.click_ADD_button();
	  mstr.click_Name(name);
	  Thread.sleep(1000);
	  mstr.click_Submit();
	  Thread.sleep(5000);
  }
  @Test(dataProvider="excelData_AddDed_HR",priority=1,enabled=false)
  public void Create_AdditionDeduction_HR(String name,String val) throws Exception
  {
	  readExcelAddDed();
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(1000);
	  mstr.click_AddDedctn_HR();
	  mstr.click_ADD_button();
	  mstr.click_Name(name);
	  mstr.Drpdwn_SelectAdditiondeduction(val);
	  Thread.sleep(1000);
	  mstr.click_ComplaintType_Submit();
	  Thread.sleep(7000);
  }
  @Test(dataProvider="excelData_Employee_HR",priority=2,enabled=true)
  public void Create_Employee_HR(String name,String address,String mob,String email,String sal,String amount,
		  String id,String passportid,String place,String drivingid) throws Exception
  {
	  readExcelAddDed();
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(1000);
	  mstr.click_Employee_HR();
	  mstr.click_ADD_button();
	  mstr.click_CaptialNName(name);
	 mstr.Create_Employee_HR(address, mob, email, sal, amount);
	  Thread.sleep(1000);
	  Calendar cld=new Calendar(driver);
	  cld.enter_CalendarValues();
	  mstr.Create_Employee_verification_Details(id, passportid, place, drivingid);
	  mstr.click_Area_Submit();
	  Thread.sleep(7000);
	 
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
