package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OwnerMasterEdits {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver ;

		WebDriverWait wait;
			driver=new ChromeDriver();
				
				
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
				driver.get("https://testing.app.eblity.com");
				//Login 
				WebElement username=driver.findElement(By.id("input-18"));
				username.sendKeys("owner@codenicley.in");

				WebElement password=driver.findElement(By.id("input-22"));
				password.sendKeys("cntest@123");

				WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/button/span"));
				login.click();
				//Get Windows Handle
				Set<String> handles=driver.getWindowHandles();

				for (String newwindow : handles) {
					
					driver.switchTo().window(newwindow);	
					
				}
				
				 wait = new WebDriverWait(driver, 10);	
				 
				//Settings
				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Settings\")]"))).click();
				 Thread.sleep(3000);
				  
			// Masters
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\" Master Data \")]"))).click();
				Thread.sleep(1000);
				
			//	//Grade
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Master Grade Data\"]"))).click();
				
			//	//Edit
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();
			//	
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div/form/div/div/div/div[2]/div/div/div[1]/div/input"))).sendKeys("1");
			//	
            //    
			//	//Save Changes
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();
			//	//Delete
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Delete\"]"))).click();
			//	//Alert Conform 
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();
			//	//Settings
			//	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Settings\")]"))).click();
			//	 Thread.sleep(3000);
			//	  
			//// Masters
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\" Master Data \")]"))).click();
				Thread.sleep(1000);
				
			//	//Class
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Master Class Data\"]"))).click();
			//	//Class Edit
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();
			//	//Select Grade
			//	WebElement grade=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Grade\"]")));
			//	grade.sendKeys(Keys.ARROW_DOWN);
			//	Thread.sleep(2000);
			//	grade.sendKeys(Keys.ENTER);
			//	Thread.sleep(2000);
			//	//Type Clase
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Class Name\"]"))).click();
			//	Thread.sleep(2000);
			//	//Save Changes
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();
			//	Thread.sleep(2000);
			//	//Delete
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Delete\"]"))).click();
			//	Thread.sleep(2000);
			//	//Alert Conform 
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();
	        //
			//	//Settings
			//	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Settings\")]"))).click();
			//	 Thread.sleep(3000);
			//	  
			//// Masters
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\" Master Data \")]"))).click();
			//	Thread.sleep(1000);
			//	                                                                                                              
			//	//Refferal Relation                                                                                                                     
	        //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Master Referral Relation Data\"]"))).click();                  
            //    // Edit                                                                                                                 
            //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();                                                                                                                           
            //    Thread.sleep(2000);                                                                                                          
            //    //Type Relation                                                                                                                 
            //    WebElement relation=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Referral Relation Name\"]")));
            //    relation.sendKeys(Keys.CONTROL+"a");
            //    relation.sendKeys(Keys.DELETE);
            //    relation.sendKeys("Coordinator");
            //    Thread.sleep(2000);                                                                                                          
            //    //Save Changes                                                                                                               
            //    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();                       
            //    Thread.sleep(2000);                                                                                                          
            //    //Delete                                                                                                                     
            //    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Delete\"]"))).click();                             
            //    Thread.sleep(2000);                                                                                                          
            //    //Alert Conform                                                                                                              
            //    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();                
            //  //Settings
			//	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Settings\")]"))).click();
			//	 Thread.sleep(3000);
			//	  
			// Masters
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\" Master Data \")]"))).click();
				Thread.sleep(1000);
				
              //Role                                                                                                                     
 	           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Master Role Data\"]"))).click();                  
                 // Edit                                                                                                                 
               wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();                                                                                                                           
                 Thread.sleep(2000);                                                                                                          
                 //Type Role                                                                                                                 
                 WebElement role=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Role Name\"]")));
                 role.sendKeys(Keys.CONTROL+"a");
                 role.sendKeys(Keys.DELETE);
                 role.sendKeys("Coordinator");
                 Thread.sleep(2000);                                                                                                          
                 //Save Changes                                                                                                               
                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();                       
                 Thread.sleep(2000);                                                                                                          
                 //Delete                                                                                                                     
                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Delete\"]"))).click();                             
                 Thread.sleep(2000);                                                                                                          
                 //Alert Conform                                                                                                              
                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();       
	
               //Settings
				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Settings\")]"))).click();
				 Thread.sleep(3000);
				  
			// Masters
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\" Master Data \")]"))).click();
				Thread.sleep(1000);
				 //Service                                                                                                                     
	 	           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Master Service Data\"]"))).click();                  
	                 // Edit                                                                                                                 
	               wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();                                                                                                                           
	                 Thread.sleep(2000);                                                                                                          
	                 //Type Service                                                                                                                 
	                 WebElement Service=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Service Name\"]")));
	                 Service.sendKeys(Keys.CONTROL+"a");
	                 Service.sendKeys(Keys.DELETE);
	                 Service.sendKeys("Development");
	                 Thread.sleep(2000);                                                                                                          
	                 //Save Changes                                                                                                               
	                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();                       
	                 Thread.sleep(2000);                                                                                                          
	                 //Delete                                                                                                                     
	                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Delete\"]"))).click();                             
	                 Thread.sleep(2000);                                                                                                          
	                 //Alert Conform                                                                                                              
	                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();   
	
	                 //Settings
					 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Settings\")]"))).click();
					 Thread.sleep(3000);
					  
				// Masters
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\" Master Data \")]"))).click();
					Thread.sleep(1000);
					 //Step                                                                                                                     
		 	           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Master Step Data\"]"))).click();                  
		                 // Edit                                                                                                                 
		               wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();                                                                                                                           
		                 Thread.sleep(2000);                                                                                                          
		                 //Type step                                                                                                                 
		                 WebElement Step=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Step Name\"]")));
		                 Step.sendKeys(Keys.CONTROL+"a");
		                 Step.sendKeys(Keys.DELETE);
		                 Step.sendKeys("Records");
		                 Thread.sleep(2000);                                                                                                          
		                 //Save Changes                                                                                                               
		                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();                       
		                 Thread.sleep(2000);                                                                                                          
		                 //Delete                                                                                                                     
		                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Delete\"]"))).click();                             
		                 Thread.sleep(2000);                                                                                                          
		                 //Alert Conform                                                                                                              
		                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();   
		
	
	}
}
