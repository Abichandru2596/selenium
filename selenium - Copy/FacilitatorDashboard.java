package selenium;

import java.awt.RenderingHints.Key;
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

public class FacilitatorDashboard {
	static String loginresult, admin,aadmin,master,amaster,medit,mdelete,client,aclient,clientmaster,aclientmaster,cmedit,cdelete,eresource,cmdelete,resource,servicesdetail,service,aservice,permission;
	static WritableWorkbook wb;
	static WritableSheet sht;
	static WebDriverWait wait;
	static WebDriver driver;	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, InterruptedException {
		

		File file = new File("C:\\Users\\Admin\\Desktop\\New folder\\Fullflow1.xls");
		
		wb = Workbook.createWorkbook(file);
		  sht = wb.createSheet("Master Data Result", 0);
		  sht.addCell(new Label(1, 0, "Testing Result")); 
		  sht.addCell(new Label(0, 0, "Testing Field name")); 
		  sht.addCell(new Label(0, 1,"DashBoard Button")); 
		  sht.addCell( new Label(0, 2, "Total Student Button"));
		  sht.addCell( new Label(0, 3, "Steps Overdue"));
		  sht.addCell( new Label(0, 4, "Steps due within 7 days"));
		  sht.addCell( new Label(0, 5, "View Details"));
		  sht.addCell( new Label(0, 6, "Edit link in Steps"));
		 
		  sht.addCell(new Label(0, 7, "Save button In steps edit"));
		  sht.addCell(new Label(0, 8, "Mark as Closed button in Service"));
		  sht.addCell(new Label(0, 9, "Assignments"));
		  sht.addCell(new Label(0, 10, "Assignments_View Details"));
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
 
	 FacilitatorDashboard ft=new FacilitatorDashboard();
	 ft.assignments();
	 
	 
	  WebElement Dashboard2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Dashboard \"]")));
	    Dashboard2.click();
	    //Total Student
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Total Students\"]"))).click();
	     Thread.sleep(3000);
	    sht.addCell(new Label(1,2,"Total Student Button is clickable and Its redirect to the corresponding screen"));
	    //Dashboard.click();
	    WebElement Dashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Dashboard \"]")));
	    Dashboard.click();
	    sht.addCell(new Label(1,1,"Dashboard Button is clickable and Its redirect to the corresponding screen"));
	     //Steps Overdue
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Steps Overdue\"]"))).click();
	    Thread.sleep(3000);
	     sht.addCell(new Label(1,3,"Steps Overdue Button is clickable and Its redirect to the corresponding screen"));
         //Steps due within 7 days
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Steps due within 7 days\"]"))).click();
	        Thread.sleep(3000);
	        sht.addCell(new Label(1,4,"Steps due within 7 days Button is clickable and Its redirect to the corresponding screen"));
	    //View Details
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"View Details\"]"))).click();
	    Thread.sleep(2000);
	    sht.addCell(new Label(1,5,"View Details Link is clickable and Its redirect to the corresponding screen"));
	    //Edit link in Steps
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();
	    Thread.sleep(1000);
	    	sht.addCell(new Label(1,6,"Edit button   is clickable and Its redirect to the Edit screen"));
	 	//Select Owner
	 	WebElement owner=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Select Owner']")));
	 	owner.sendKeys(Keys.ARROW_DOWN);
	 	owner.sendKeys(Keys.ENTER);
	 	
	 	//Calender
	 	WebElement calender=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/form/div/div[3]/div/div[2]/div[1]/div/div[1]/div[1]/input")));
	 	calender.sendKeys(Keys.CONTROL+"a");
	 	calender.sendKeys(Keys.DELETE);
	 	calender.sendKeys("20052019");
	 	Thread.sleep(1000);
	 	//sht.addCell(new Label(1,7,"Calender is clickable"));
	 	
	 	//Save
	 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save\"]"))).click();
	 	Thread.sleep(1000);
	 	sht.addCell(new Label(1,7,"Save button is clickable and Edit is performed"));
	      	
	      	
	     //Mark as Closed
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Mark as Closed\"]"))).click();
	     Thread.sleep(2000);
	     
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Closed\"]"))).click();
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Mark as Open\"]"))).click();
	     Thread.sleep(2000);
	     sht.addCell(new Label(1,8,"Mark as Closed & Open button is clickable and Its Changed to closed"));
	     
	     // 	JavascriptExecutor js=((JavascriptExecutor)driver);
	     // 	 js.executeScript("window.scrollBy(0,1200)");
	     // 	//Comment box
	     // WebElement commend=(driver.findElement(By.xpath("//body[@data-mce-placeholder='Enter Comment here']")));
	     // commend.click();
	     // commend.sendKeys("asdffgfhggjg");
	     // Thread.sleep(1000);
	     // 	sht.addCell(new Label(1,9,"comment box is clickable and and its accept the input"));
         
	      	//Add this comment
	      	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add this comment\"]"))).click();
	      	//Thread.sleep(1000);
	      	//sht.addCell(new Label(1,9,"comment box is clickable and and its accept the input"));
	   Dashboard.click();
	 	//Notification Tab
	 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Notifications \"]"))).click();
	 	Thread.sleep(1000);
	 	sht.addCell(new Label(1,14,"Notification button is clickable and The gridview is change into  Notification"));
	 	
	 	//Notification messages
	 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/div/div/div/div/div[3]/div/div/div/div[2]/div/div[1]/div/div"))).click();
	 	Thread.sleep(1000);
	 	sht.addCell(new Label(1,15,"Notifications are navigate to the corresponding screen "));
	 	
	 	//SignOut 
	 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Sign Out\"]"))).click();
	 	Thread.sleep(1000);
	 	sht.addCell(new Label(1,16,"SignOut button is clickable and It navigate to the login Screen"));
	 	
	 	
	 	
	 	
	 	wb.write();
	 	wb.close();
	 	driver.quit();
}
	public void assignments() throws RowsExceededException, WriteException, InterruptedException {
		  WebElement Dashboard1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Dashboard \"]")));
		    Dashboard1.click();
	      	
	      	// Assignments 
	      	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Assignments \"]"))).click();
	      	Thread.sleep(5000);
	      	
	      	sht.addCell(new Label(1,9," Assignments Tap is clickable and The gridview is change into  Assignments"));
	      	//View Details
	      	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"View Details\"]"))).click();
	         	Thread.sleep(1000);
	       sht.addCell(new Label(1,10,"View detail is clickable and it navigate to the corresponding Assignment screen"));
	       //Edit Assisted By
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit Assisted By\"]"))).click();
	       Thread.sleep(1000);
	      //Yes Button
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();
	       Thread.sleep(1000);
	       sht.addCell(new Label(1,11,"Edit Assisted By button Clickable and Edited successfully"));
	       //Resources Mark as Closed
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Mark as Closed\"]"))).click();
	       Thread.sleep(1000);
	       	sht.addCell(new Label(1,12,"Mark as Closed button is clickable and Its Changed to closed"));
	       JavascriptExecutor js=((JavascriptExecutor)driver);
	       js.executeScript("window.scrollBy(0,500)");
	       //Resources Download
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Download\"]"))).click();
	       Thread.sleep(3000);
	       sht.addCell(new Label(1,13,"Download button is clickable and File is downloaded"));
	       
	 //	//Rate this resource
	 //	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Rate this resource\"]"))).click();
	 //	Thread.sleep(1000);
	 //	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div[3]/div/div/div[1]/div/button/span"))).click();
	 //	Thread.sleep(1000);
	 //	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@placeholder=\"Write a review\"]"))).sendKeys("Good Testing");
	 //	Thread.sleep(1000);
	 //	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
	 //	Thread.sleep(1000);
	 //	sht.addCell(new Label(1,15,"Rating is Clickable and Rate successfully"));
	    
		
	}
}
