package com.Maintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Master {
	WebDriver driver;
	WebDriverWait wait;
	
	//Product
	By click_Masters= By.xpath("//a[text()='Masters']");
	By click_ProductCtgry_Product=By.xpath("//a[text()='Product Category']");
	By click_Brand_Product=By.xpath("//a[text()='Brand']");
	By click_Product_Product=By.xpath("(//a[text()='Product'])[2]");
	By click_Model_Product=By.xpath("//a[text()='Model']");
	By click_Name_ProuctCategory=By.xpath("//input[@role='combobox']");
	
	
	//Inventory
	By click_Category_Inventory= By.xpath("//a[text()='Category']");
	By click_Brand_Inventory=By.xpath("//a[text()='Category']//ancestor::ul[1]/li[3]/a[text()='Brand']");
	By click_UOM_Inventory=By.xpath("//a[text()='UOM']");
	By click_SpareParts_Inventory=By.xpath("//a[text()='Spare Parts']");
	By enter_minSLQty_Inventory=By.id("minSLQty");
	By enter_maxSLQty_Inventory=By.id("maxSLQty");
	By enter_rol_Inventory=By.id("rol");
	By enter_roQty_Inventory=By.id("roQty");
	By enter_barcode_Inventory=By.id("newAttributeBarcode");
	By enter_cost_Inventory=By.id("newAttributeCost");
	By enter_rate_Inventory=By.id("newAttributeRate");
	
	//Customer
	By click_Nationality_Customer= By.xpath("//a[text()='Nationality']");
	By click_City_Customer= By.xpath("//a[text()='City']");
	By click_Area_Customer= By.xpath("//a[text()='Area']");
	By click_Consumer_Customer=By.xpath("//a[text()='Consumer']");
	By click_branch_Customer=By.xpath("//a[text()='Branch']");
	
	By enter_place_Customer=By.id("place");
	By enter_address_Customer=By.id("address");
	By enter_landmark_Customer=By.id("landmark");
	By enter_pin_Customer=By.id("pin");
	By enter_id_Customer=By.id("pin");
	By enter_tel_Customer=By.id("tel");
	By enter_alttel_Customer=By.id("alttel");
	By enter_email_Customer=By.id("email");
	By enter_Branch_Customer=By.id("branch");
	
	//Corporate consumer
	
	By clickRadioBtn_Corporate=By.xpath("//label[@for='radio-2']");
	By enter_CntctCorp_Customer=By.id("contactperson");
	By enter_MobCorp_Customer=By.id("cpmob");
	By enter_CorpEmail_Customer=By.id("cpemail");
	
	//MAINTENANCE
	
	By click_Maintenance_mtnc=By.xpath("//a[text()='Maintenance']");
	By click_ServiceCategory_mtnc=By.xpath("//a[text()='Service Category']");
	By click_Services_mtnc=By.xpath("//a[text()='Services']");
	By click_ComplaintType_mtnc=By.xpath("//a[text()='Complaint Type']");
	By click_AMC_mtnc=By.xpath("//a[text()='AMC Category']");
	
	//HR
	
	By click_Designation_HR=By.xpath("//a[text()='Designation']");
	By click_AdditionsDeductions_HR=By.xpath("//a[text()='Additions/Deductions']");
	By click_Employee_HR=By.xpath("//a[text()='Employee']");
	By enter_Mobile_HR=By.id("Mobile");
	By enter_BasicSalary_HR=By.id("BasicSalary");
	By enter_Amount_HR=By.id("Amount");
	By click_PlusButton_HR=By.xpath("//h4[text()='+']");
	By enter_CapitalAAdress_HR=By.id("Address");
	By enter_CapitalEEmail_HR=By.id("Email");
	
	By id_HR=By.id("IDNo");
	By IDExpiry_HR=By.id("IDExpiry");
	
	By Passportno_HR=By.id("PassportNo");
	By PassportExpiry_HR=By.id("PassportExpiry");
	By PassIssuePlace_HR=By.id("PassportIssuedPlace");
	By DrivingLicNO_HR=By.id("DrivingLicenceNo");
	By DrivingLicExp_HR=By.id("DrivingLicenceExpiry");
	By click_Calendar2020=By.xpath("//span[text()='2020']");
	By click_Calendar2024=By.xpath("//span[text()='2024']");
	
	
	//ACCOUNTS
	By click_Customer_Accounts=By.xpath("//a[text()='Customer']");
	By click_Vender_Accounts=By.xpath("//a[text()='Vender']");
	By click_Account_Accounts=By.xpath("//a[text()='Accounts']");
	By click_TaxGroup_Accounts=By.xpath("//a[text()='Tax Group']");
	
	By enter_Code_Customer=By.id("txtCode");
	By enter_Account_Customer=By.id("txtAccount");
	By enter_Name_Customer=By.id("txtAname");
	By enter_Name_Vender=By.id("txtaname");
	By enter_tel_AccountCustomer=By.id("txtTel");
	By enter_mob_AccountCustomer=By.id("txtMobile");
	By enter_email_AccountCustomer=By.id("txtEmail");
	By enter_address_AccountsCustomer=By.id("txtAddress");
	By enter_OB_AccountsCustomer=By.id("txtObalance");
	By enter_Paymentmode_AccountCustomer=By.id("optMode");
	
	
	
	//MAINTENANANCE LABEL CLICK
	By maint=By.xpath("//a[text()='Maintenance Module']");
	
	//ADD-BUTTON
	By click_ADD_Button=By.xpath("(//div//button[@type='button'])[1]");
	
	//NAME
	By click_Name=By.id("name");
	By click_CapitalNName=By.id("Name");
	
	//CATEGORYNAME
	By click_ctgryName=By.id("txtname");
	
	//SUBMIT//area submit has space after T
	By click_Submit=By.xpath("//button[text()='SUBMIT']");
	By click_Area_Submit=By.xpath("//button[text()='SUBMIT ']");
	By click_ComplaintType_Submit=By.xpath("//button[text()=' SUBMIT']");
	
	//MODEL
	By Drpdwn_Prouct=By.xpath("(//div//input[@role='combobox'])[1]");
	By Drpwn_Brand=By.xpath("(//div//input[@role='combobox'])[2]");

	public Master(WebDriver driver)
	{
		
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 30);
		
	}
	public void click_Masters() throws Exception
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@id='navigation1']"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_Masters)).click();
	}
	public void click_Submit() throws Exception
	{
		//Boolean submitenable=driver.findElement(By.xpath("//button[text()='SUBMIT']")).isDisplayed();
		
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(click_Submit)).click();
			String cat=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message ng-star-inserted']"))).getText();
			if(cat.equals("Duplicate Name Found!"))
			{
				System.out.println(cat);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//button[text()='EXIT']"))).click();
			}
			else
			{
				
				System.out.println(cat);
			}
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//button[text()='EXIT']"))).click();
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@id='navigation1']"))).click();

		}
				
	public void click_Area_Submit() throws Exception
	{
		//Boolean submitenable=driver.findElement(By.xpath("//button[text()='SUBMIT']")).isDisplayed();
		
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(click_Area_Submit)).click();
			String cat=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message ng-star-inserted']"))).getText();
			if(cat.equals("Duplicate Name Found!") || cat.equals("Duplicate Telephone Number Found!") || cat.equals("Duplicate Email Found!"))
			{
				System.out.println(cat);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//button[text()='EXIT']"))).click();
			}
			else
			{
				
				System.out.println(cat);
			}
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//button[text()='EXIT']"))).click();
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@id='navigation1']"))).click();

		}
				
	public void click_ComplaintType_Submit() throws Exception
	{
		//Boolean submitenable=driver.findElement(By.xpath("//button[text()='SUBMIT']")).isDisplayed();
		
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(click_ComplaintType_Submit)).click();
			String cat=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message ng-star-inserted']"))).getText();
			if(cat.equals("Duplicate Name Found!") || cat.equals("Duplicate Telephone Number Found!") || cat.equals("Duplicate Email Found!"))
			{
				System.out.println(cat);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//button[text()='EXIT']"))).click();
			}
			else
			{
				
				System.out.println(cat);
			}
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//button[text()='EXIT']"))).click();
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@id='navigation1']"))).click();

		}
				
	
	public void click_Name(String name)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_Name)).sendKeys(name);
	}
	public void click_CaptialNName(String name)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_CapitalNName)).sendKeys(name);
	}
	public void click_ctgryName(String ctgry)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_ctgryName)).sendKeys(ctgry);
	}
	public void click_ADD_button()
	{
		
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_ADD_Button));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_ADD_Button)).click();
	}
	public void click_Product_Product() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Product_Product));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
		 
		
		
	}
	public void click_Brand_Product()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Brand_Product)).click();
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Brand_Product));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_ProductCtgry_Product()
	{
		
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_ProductCtgry_Product));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_Model_Product()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Model_Product)).click();
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Model_Product));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void Creation_ProductCtgry_Master()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_Name_ProuctCategory)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Name)).sendKeys(Ctgry);
	}
	public void Creation_Model_Master() throws Exception
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Drpdwn_Prouct)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Drpwn_Brand)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
	}
	
	public void clickCtgry_Inventory() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Category_Inventory));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
		 
	}
	public void clickBrand_Inventory() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Brand_Inventory));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
		 
	}
	public void clickUOM_Inventory() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_UOM_Inventory));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
		 
	}
	public void clickSpareParts_Inventory() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_SpareParts_Inventory));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
		 
	}
	public void Creation_SpareParts_Inventory(String msl,String mxSL,String ROL,String ROQ,String Barcode,String Cost,String Rate) throws Exception
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[2]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[5]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[6]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[8]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[9]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		//MINMAXORDERQTY
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_minSLQty_Inventory)).sendKeys(msl);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_maxSLQty_Inventory)).sendKeys(mxSL);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[4]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_rol_Inventory)).sendKeys(ROL);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[7]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_roQty_Inventory)).sendKeys(ROQ);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[10]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='dropdown-btn']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li//div)[3]"))).click();
		//BARCODE
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_barcode_Inventory)).sendKeys(Barcode);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_cost_Inventory)).sendKeys(Cost);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_rate_Inventory)).sendKeys(Rate);
		
	}
	public void click_Nationality_Customer() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Nationality_Customer));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_City_Customer() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_City_Customer));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_Area_Customer() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Area_Customer));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_Consumer_Customer() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Consumer_Customer));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_Branch_Customer() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_branch_Customer));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void Create_Individual_Consumer_Customer(String place,String address,String landmark,String pin,String tel,String altel,String email)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_place_Customer)).sendKeys(place);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[2]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_address_Customer)).sendKeys(address);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_landmark_Customer)).sendKeys(landmark);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_pin_Customer)).sendKeys(pin);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_tel_Customer)).sendKeys(tel);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_alttel_Customer)).sendKeys(altel);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_email_Customer)).sendKeys(email);
	}
	
	public void radioButton_Corporate_Consumer()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickRadioBtn_Corporate)).click();
	}
	public void Create_Corporate_Consumer_Customer(String cntcPerson,String mob,String Corpemail)
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_CntctCorp_Customer)).sendKeys(cntcPerson);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_MobCorp_Customer)).sendKeys(mob);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_CorpEmail_Customer)).sendKeys(Corpemail);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
	}
	public void Create_Branches_Customer(String branch,String address,String place,String landmark,String pin,String tel,String altel,
			String email,String cntcPerson,String mob,String Corpemail)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_Branch_Customer)).sendKeys(branch);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_address_Customer)).sendKeys(address);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_place_Customer)).sendKeys(place);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_landmark_Customer)).sendKeys(landmark);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[2]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_pin_Customer)).sendKeys(pin);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_tel_Customer)).sendKeys(tel);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_alttel_Customer)).sendKeys(altel);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_email_Customer)).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_CntctCorp_Customer)).sendKeys(cntcPerson);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_MobCorp_Customer)).sendKeys(mob);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_CorpEmail_Customer)).sendKeys(Corpemail);
	}
	public void click_ServiceCategory_Maitenance()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Model_Product)).click();
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_ServiceCategory_mtnc));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_Service_Maitenance()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Model_Product)).click();
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Services_mtnc));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_ComplaintType_Maitenance()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Model_Product)).click();
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_ComplaintType_mtnc));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_AMC_Maitenance()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Model_Product)).click();
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_AMC_mtnc));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	
	public void Create_ComplaintType_Maintenance()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
	}
	public void click_Designation_HR()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Model_Product)).click();
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Designation_HR));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_AddDedctn_HR()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Model_Product)).click();
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_AdditionsDeductions_HR));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_Employee_HR()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(click_Model_Product)).click();
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Employee_HR));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void Drpdwn_SelectAdditiondeduction(String val)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("type"))).click();
		Select drpwn1=new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("type"))));
		drpwn1.selectByVisibleText(val);
	}
	public void Create_Employee_HR(String address,String mob,String email,String sal,String amount)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_CapitalAAdress_HR)).sendKeys(address);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_Mobile_HR)).sendKeys(mob);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_CapitalEEmail_HR)).sendKeys(email);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[2]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_BasicSalary_HR)).sendKeys(sal);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='option']/span)[6]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_Amount_HR)).sendKeys(amount);
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_PlusButton_HR)).click();
		
	}
	public void Create_Employee_verification_Details(String id,String passportid,String place,String drivingid)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(id_HR)).sendKeys(id);
		wait.until(ExpectedConditions.visibilityOfElementLocated(IDExpiry_HR)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_Calendar2020)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_Calendar2024)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='August']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='14']"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Passportno_HR)).sendKeys(passportid);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PassportExpiry_HR)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_Calendar2020)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_Calendar2024)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='August']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='14']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(PassIssuePlace_HR)).sendKeys(place);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(DrivingLicNO_HR)).sendKeys(drivingid);
		wait.until(ExpectedConditions.visibilityOfElementLocated(DrivingLicExp_HR)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_Calendar2020)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(click_Calendar2024)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='August']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='14']"))).click();
	}
	public void click_Customer_Accounts() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Customer_Accounts));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_Vender_Accounts() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Vender_Accounts));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_Account_Accounts() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_Account_Accounts));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void click_TaxGroup_Accounts() throws Exception
	{
		WebElement tin=driver.findElement(By.xpath("//nav[@id='navigation1']"));
		WebElement movetoProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(click_TaxGroup_Accounts));
		Actions action=new Actions(driver);
		action.moveToElement(movetoProduct).click().build().perform();
		
		action.moveToElement(tin).build().perform();
	}
	public void Customer_AccountCreation(String code,String account,String name,String tel,String mob,String email,String address,String OB,String paymentmode)
	{
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_Code_Customer)).sendKeys(code);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_Account_Customer)).sendKeys(account);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_Name_Customer)).sendKeys(name);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_tel_AccountCustomer)).sendKeys(tel);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_mob_AccountCustomer)).sendKeys(mob);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_email_AccountCustomer)).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_address_AccountsCustomer)).sendKeys(address);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_OB_AccountsCustomer)).sendKeys(OB);

		Select drpwn1=new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("optMode"))));
		drpwn1.selectByVisibleText(paymentmode);
	}
	public void Vender_AccountCreation(String code,String account,String name,String tel,String mob,String email,String address,String OB,String paymentmode)
	{
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_Code_Customer)).sendKeys(code);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_Account_Customer)).sendKeys(account);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_Name_Vender)).sendKeys(name);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_tel_AccountCustomer)).sendKeys(tel);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_mob_AccountCustomer)).sendKeys(mob);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_email_AccountCustomer)).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_address_AccountsCustomer)).sendKeys(address);
		wait.until(ExpectedConditions.visibilityOfElementLocated(enter_OB_AccountsCustomer)).sendKeys(OB);

		Select drpwn1=new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("optMode"))));
		drpwn1.selectByVisibleText(paymentmode);
	}
}
