package selenium;

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

public class StudentEdit {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
WebDriver driver ;

WebDriverWait wait;
	driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://testing.app.eblity.com");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


		WebElement username=driver.findElement(By.id("input-18"));
		username.sendKeys("owner@codenicley.in");

		WebElement password=driver.findElement(By.id("input-22"));
		password.sendKeys("cntest@123");

		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/button/span"));
		login.click();
		Set<String> handles=driver.getWindowHandles();

		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);	
			
		}
		
		 wait = new WebDriverWait(driver, 10);	
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Students\")]"))).click();
			 Thread.sleep(3000);
			 
			 //Student Name
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Ben Wyatt\"]"))).click();
			 Thread.sleep(3000);
			 JavascriptExecutor js = ((JavascriptExecutor) driver);
			
			
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
			 //Action 
	
	
			//WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/div/div[3]/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[7]/button/span/i")));
			//element.click();
			
			//Thread.sleep(3000);
			// //inactive
			//  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Inactive\"]"))).click();
			//  Thread.sleep(3000);
			// //Remove
			//  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Remove\"]"))).click();
			//  Thread.sleep(3000);
			 js.executeScript("window.scrollBy(0,500)");
			 //Add student Goal
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Student Goal\"]"))).click();
			 Thread.sleep(3000);
			 //Goal
			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/form/div/div[1]/div/div/div[1]/div/input")).sendKeys("Testing for goal");
			 Thread.sleep(3000);
			 //Current base line
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/form/div/div[2]/div/div/div[1]/div/input"))).sendKeys("Testing Baseline");
			 Thread.sleep(3000);
			////Calender
			// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[11]/div/div/div[2]/form/div/div[3]/div[1]/div/div[1]/div[1]/input"))).sendKeys("");
	        // Thread.sleep(3000);
	        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[11]/div/div/div[2]/form/div/div[3]/div[1]/div/div[1]/div[1]/input"))).sendKeys("30/12/2020");
	        // Thread.sleep(3000);
	        
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
	         Thread.sleep(3000);
	          //Action
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/div/div[4]/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[7]/button/span/i"))).click();
	      	 Thread.sleep(3000);
	      	 //Closed
	      	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Closed\"]"))).click();
			 Thread.sleep(3000);
			 //Add student service
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Student Service\"]"))).click();
			 Thread.sleep(3000);
			 //Service
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Select Service']"))).sendKeys("Planning"+Keys.ENTER);
			 Thread.sleep(3000);
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/nav/nav/div[1]/div[1]/div/div/div/div[3]"))).click();
			 js.executeScript("window.scrollBy(0,500)");
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/form/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/button/span"))).click();
			 Thread.sleep(1000);
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/form/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/button/span/i"))).click();
			 Thread.sleep(1000);                                          
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/form/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/button/span/i"))).click();
			 Thread.sleep(1000);
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Select Owner']"))).sendKeys("Abirami C"+Keys.ENTER);
			 Thread.sleep(1000);
			 js.executeScript("window.scrollBy(0,-500)");

			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/nav/nav/div[1]/div[1]/div/div/div/div[3]"))).click();
			 //Thread.sleep(3000);
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
 
	}

}
