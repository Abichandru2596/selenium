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

public class AddServiceOwner {
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
				
	
	
	
				 js.executeScript("window.scrollBy(0,2000)");
	
	
	 //Add student service
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Student Service\"]"))).click();
	 Thread.sleep(3000);
	 //Service
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Select Service']"))).sendKeys("Planning"+Keys.ENTER);
	 Thread.sleep(3000);
	 
	// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/nav/nav/div[1]/div[1]/div/div/div/div[3]"))).click();
	 js.executeScript("window.scrollBy(0,500)");
	 //Delete
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/form/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/button/span"))).click();
	 Thread.sleep(1000);
	 //delete
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/form/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/button/span/i"))).click();
	 Thread.sleep(1000);
	 //delete
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/form/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/button/span/i"))).click();
	 Thread.sleep(1000);
	 //Select Owner
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Select Owner']"))).sendKeys("Abirami C"+Keys.ENTER);
	 Thread.sleep(1000);
	 
	 js.executeScript("window.scrollBy(0,-500)");
    
	
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/nav/nav/div[1]/div[1]/div/div/div/div[3]"))).click();
	 //Thread.sleep(3000);
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
	 //Add New Step
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add New Step\"]"))).click();
	 //Add Step
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Step\"]"))).click();
	 
	 
     //Select owner
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/form/div/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]"))).sendKeys("Soumya Mishra"+Keys.ENTER);
	 
     //Submit
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
	
	//Close
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Close\"]"))).click();
	
	 
	 //Add Resources
	 js.executeScript("window.scrollBy(0,1000)");	 
	 

	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Resources\"]"))).click();
	//All resources
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"All Resources\"]"))).click();
	//Add to student
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[10]/div/div/div[2]/div/div[1]/div/div[1]/div[5]/div/button/span"))).click();
	//Close
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Close\"]"))).sendKeys("Soumya Mishra"+Keys.ENTER);
		
	
	 
	}


}
