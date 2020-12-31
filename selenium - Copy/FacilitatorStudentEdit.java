package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class FacilitatorStudentEdit {
	//static String loginresult, admin,aadmin,master,amaster,medit,mdelete,client,aclient,clientmaster,aclientmaster,cmedit,cdelete,eresource,cmdelete,resource,servicesdetail,service,aservice,permission;
	static WritableWorkbook wb;
	static WritableSheet sht;
	static WebDriverWait wait;
	static WebDriver driver;	
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException, InterruptedException {
		
File file = new File("C:\\Users\\Admin\\Desktop\\New folder\\Fullflow1.xls");
		
		wb = Workbook.createWorkbook(file);
		  sht = wb.createSheet("Master Data Result", 0);
		  sht.addCell(new Label(1, 0, "Testing Result")); 
		  sht.addCell(new Label(0, 0, "Testing Field name")); 
		  sht.addCell(new Label(0, 1,"Student menu")); 
		  sht.addCell( new Label(0, 2, "Student View Profile"));
		  sht.addCell( new Label(0, 3, "Edit Student Profile"));
		  sht.addCell( new Label(0, 4, "Save changes"));
		  sht.addCell( new Label(0, 5, "Add internal team"));
		  sht.addCell( new Label(0, 6, "Add Family"));
		  sht.addCell(new Label(0, 7, "Add student service"));
		  sht.addCell(new Label(0, 8, "Add student Goal"));
		  sht.addCell(new Label(0, 9, "student Goal Action"));
		  sht.addCell(new Label(0, 10, "Add New Step"));
		  sht.addCell(new Label(0, 11, "Edit Assisted By"));
		  sht.addCell(new Label(0, 12, "Resources Mark as Closed"));
		  sht.addCell(new Label(0, 13, "Resources Download"));
		  sht.addCell(new Label(0, 14, "Notification Tab"));
		  sht.addCell(new Label(0, 15, "Notification messages"));
		  sht.addCell(new Label(0, 16, "SignOut"));
		
		  
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	driver.get("https://testing.app.eblity.com");

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


	WebElement username=driver.findElement(By.id("input-18"));
	username.sendKeys("facilitator1@codenicley.in");

	WebElement password=driver.findElement(By.id("input-22"));
	password.sendKeys("cntest@123");

	WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/button/span"));
	login.click();
	Set<String> handles=driver.getWindowHandles();

	for (String newwindow : handles) {
		
		driver.switchTo().window(newwindow);	
		
	}
	
	 wait = new WebDriverWait(driver, 10);	
	 

	 FacilitatorStudentEdit fst=new FacilitatorStudentEdit();
	fst.Addnewstep();
	 fst.student();
	 fst.Addservice();
	  fst.Addstudentgoal();
       wb.write();
	 	wb.close();
	 	driver.quit();
     
	}
	public void Addstudentgoal() throws InterruptedException, RowsExceededException, WriteException {
		// Students Menu
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Students \"]"))).click();
	     Thread.sleep(2000);
	     // View Student Profile
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"View Profile\"]"))).click();
	     Thread.sleep(3000);
	     JavascriptExecutor js=((JavascriptExecutor)driver);
	     js.executeScript("window.scrollBy(0,800)");
	     
	   //Add student Goal
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Student Goal\"]"))).click();
		 Thread.sleep(3000);
		 //Goal
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/form/div/div[1]/div/div/div[1]/div/input")).sendKeys("Testing for goal");
		 Thread.sleep(3000);
		 //Current base line
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/form/div/div[2]/div/div/div[1]/div/input"))).sendKeys("Testing Baseline");
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
         Thread.sleep(3000);
         sht.addCell(new Label(1,8 ,"Student goal added successfully"));
         
         //Action
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/div/div[4]/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[7]/button/span/i"))).click();
      	 Thread.sleep(3000);
      	 //Closed
      	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Closed\"]"))).click();
		 Thread.sleep(3000);
		 sht.addCell(new Label(1,9 ,"Action done successfully"));
         
	}
	
	public void student() throws InterruptedException, RowsExceededException, WriteException {
		
		 // Students Menu
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Students \"]"))).click();
	     sht.addCell(new Label(1, 1, "Student menu is clickable and its navigate to the Student List screen"));
	     Thread.sleep(3000);
	     // View Student Profile
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"View Profile\"]"))).click();
	     Thread.sleep(3000);
	     sht.addCell(new Label(1,2 ,"Student menu is clickable and its navigate to the Student List screen"));
	     // Edit Student Profile
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit Student Profile\"]"))).click();
	     Thread.sleep(3000);
	     sht.addCell(new Label(1,3 ,"Student Edit button is clickable and its navigate to the Edit screen"));
	     //Calender
	      WebElement calender= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div/form/div/div[3]/div/div[2]/div[1]/div/div[1]/div[1]/input")));
	      calender.sendKeys(Keys.CONTROL+"a");
	      calender.sendKeys(Keys.DELETE);
	      calender.sendKeys("25062000");
	      Thread.sleep(3000);
	     //Save changes
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();
	     Thread.sleep(3000);
	     sht.addCell(new Label(1,4 ,"Changes Saved Successfully"));
	   //Add team
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Team\"]"))).click();
		 Thread.sleep(3000);
		//Add internal team
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Internal Team\"]"))).click();
		 Thread.sleep(3000);
		//Add
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"ADD\"]"))).click();
		 Thread.sleep(3000);
		//Close
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Close\"]"))).click();
		 Thread.sleep(3000);
		 sht.addCell(new Label(1,5 ,"Internal team added Successfully"));
		 
		 //Add team
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Team\"]"))).click();
		 Thread.sleep(3000);
		 //Add Family
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Family\"]"))).click();
	     Thread.sleep(3000);
	     
	     //First Name
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter First Name']"))).sendKeys("Abirami");
	       Thread.sleep(1000);
	     //Last Name
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Last Name']"))).sendKeys("C");
	       Thread.sleep(1000);
	     //Email
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Email']"))).sendKeys("Quality123testing@gmail.com");
	       Thread.sleep(1000);
	     //Contact
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Contact']"))).sendKeys("9878865643");
	       Thread.sleep(1000);
	     //Relation
	       WebElement relation=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Relation']")));
	       relation.sendKeys(Keys.ARROW_DOWN);
	       relation.sendKeys(Keys.ENTER);
	       
	       Thread.sleep(1000);
	     //Role
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Role']"))).sendKeys("Primary"+Keys.ENTER);
	       Thread.sleep(1000);
	     //Submit
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
	       Thread.sleep(1000);
	       sht.addCell(new Label(1,6 ,"Family member added Successfully"));
	   	
	}
	
	public void Addservice() throws InterruptedException, RowsExceededException, WriteException {

		
		// Students Menu
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Students \"]"))).click();
	     Thread.sleep(2000);
	     // View Student Profile
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"View Profile\"]"))).click();
	     Thread.sleep(3000);
	     JavascriptExecutor js=((JavascriptExecutor)driver);
	     js.executeScript("window.scrollBy(0,1000)");
	     //Add student service
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Student Service\"]"))).click();
		 Thread.sleep(3000);
		 //Service
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Select Service']"))).sendKeys("Planning"+Keys.ENTER);
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/nav/nav/div[1]/div[1]/div/div/div/div[3]"))).click();
		 js.executeScript("window.scrollBy(0,500)");
		//Delete icon
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/main/div/div/div/form/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/button/span/i"))).click();
		 Thread.sleep(3000);
		//Delete icon
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/main/div/div/div/form/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/button/span/i"))).click();
		 Thread.sleep(3000);
		//Delete icon
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/main/div/div/div/form/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/button/span/i"))).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Select Owner']"))).sendKeys("Client Facilitator 1"+Keys.ENTER);
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,-500)");
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/nav/nav/div[1]/div[1]/div/div/div/div[3]"))).click();
		 //Thread.sleep(3000);
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();

		 sht.addCell(new Label(1,7 ,"Add Student Service Successfully"));
	}
    public void Addnewstep() throws InterruptedException, RowsExceededException, WriteException {
    	
    	 // Students Menu
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Students \"]"))).click();
	     Thread.sleep(2000);
	     // View Student Profile
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"View Profile\"]"))).click();
	     Thread.sleep(3000);
	     JavascriptExecutor js=((JavascriptExecutor)driver);
	     js.executeScript("window.scrollBy(0,1400)");
	     //Add New Step
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add New Step\"]"))).click();
	     Thread.sleep(2000);
	     //Add Step
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Step\"]"))).click();
	     Thread.sleep(2000);
	     //Submit
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
	     Thread.sleep(2000);
	     //Close
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Close\"]"))).click();
	     Thread.sleep(2000);
	     sht.addCell(new Label(1,10 ,"Add Student Service Successfully"));
 }
}
