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

public class TC_03_Customer_Master {
	WebDriver driver;
	
	@DataProvider(name="excelData_Nationality")
	public Object[][] readExcelNationality_Customer() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet9");
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
	@DataProvider(name="excelData_City")
	public Object[][] readExcelCity_Customer() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet10");
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
	@DataProvider(name="excelData_Area")
	public Object[][] readExcelArea_Customer() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet11");
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
	@DataProvider(name="excelData_IndConsumer")
	public Object[][] readExcelIndividual_Customer() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet12");
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
	@DataProvider(name="excelData_CorpConsumer")
	public Object[][] readExcelCorporateConsumer_Customer() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet13");
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
			obj[i][10]=sheet.getRow(i+1).getCell(10).toString();
			
		}
		System.out.println("test");
		return obj;
	}
	@DataProvider(name="excelData_Branch")
	public Object[][] readExcelBranch_Customer() throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\Mainten.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet14");
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
			obj[i][10]=sheet.getRow(i+1).getCell(10).toString();
			
		}
		System.out.println("test");
		return obj;
	}
  @Test(dataProvider="excelData_Nationality",priority=0,enabled=true)
  public void CreateNationality_Customer(String name) throws Exception 
  {
	
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(1000);
	  mstr.click_Nationality_Customer();
	  Thread.sleep(1000);
	  mstr.click_ADD_button();
	  mstr.click_Name(name);
	  Thread.sleep(1000);
	  mstr.click_Submit();
	  Thread.sleep(5000);
	   
  }
  @Test(dataProvider="excelData_City",priority=1,enabled=true)
  public void CreateCity_Customer(String name) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(1000);
	  mstr.click_City_Customer();
	  Thread.sleep(1000);
	  mstr.click_ADD_button();
	  mstr.click_Name(name);
	  Thread.sleep(1000);
	  mstr.click_Submit();
	  Thread.sleep(5000);
  }
  @Test(dataProvider="excelData_Area",priority=2,enabled=true)
  public void CreateArea_Customer(String name) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(1000);
	  mstr.click_Area_Customer();
	  Thread.sleep(1000);
	  mstr.click_ADD_button();
	  mstr.click_Name(name);
	  mstr.Creation_ProductCtgry_Master();
	  Thread.sleep(1000);
	  mstr.click_Area_Submit();
  }
  @Test(dataProvider="excelData_IndConsumer",priority=3,enabled=true)
  public void Create_IndConsumer_Customer(String name,String place,String address,String landmark,String pin,String tel,String altel,String email) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(1000);
	  mstr.click_Consumer_Customer();
	  Thread.sleep(1000);
	  mstr.click_ADD_button();
	  mstr.click_Name(name);
	  mstr.Create_Individual_Consumer_Customer(place,address,landmark,pin,tel,altel,email);
	  Thread.sleep(1000);
	  mstr.click_Area_Submit();
	  Thread.sleep(5000);
  }
  @Test(dataProvider="excelData_CorpConsumer",priority=4,enabled=true)
  public void Create_CorpConsumer_Customer(String name,String place,String address,String landmark,String pin,String tel,String altel,String email,String cntcPerson,String mob,String corpemail) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(1000);
	  mstr.click_Consumer_Customer();
	  Thread.sleep(1000);
	  mstr.click_ADD_button();
	  mstr.radioButton_Corporate_Consumer();
	  mstr.click_Name(name);
	  mstr.Create_Individual_Consumer_Customer(place,address,landmark,pin,tel,altel,email);
	  mstr.Create_Corporate_Consumer_Customer(cntcPerson,mob,corpemail);
	  Thread.sleep(1000);
	  mstr.click_Area_Submit();
	  Thread.sleep(5000);
  }
  @Test(dataProvider="excelData_Branch",priority=5,enabled=true)
  public void Create_Branch_Customer(String branch,String address,String place,String landmark,String pin,String tel,String altel,
			String email,String cntcPerson,String mob,String Corpemail) throws Exception 
  {
	  Master mstr=new Master(driver);
	  mstr.click_Masters();
	  Thread.sleep(1000);
	  mstr.click_Branch_Customer();
	  Thread.sleep(1000);
	  mstr.click_ADD_button();
	  mstr.Create_Branches_Customer(branch, address, place, landmark, pin, tel, altel, email, cntcPerson, mob, Corpemail);
	  Thread.sleep(1000);
	  mstr.click_Area_Submit();
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
