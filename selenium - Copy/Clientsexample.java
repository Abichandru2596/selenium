package selenium;

import java.awt.RenderingHints.Key;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clientsexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
WebDriver   driver;
WebDriverWait wait;
		
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://testing.app.eblity.com");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


		WebElement username=driver.findElement(By.id("input-18"));
		username.sendKeys("yash.chandani@codenicely.in");

		WebElement password=driver.findElement(By.id("input-22"));
		password.sendKeys("Reliance@98");

		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/button/span"));
		login.click();
		
		Set<String> handles=driver.getWindowHandles();

		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);	
			
		}
		
		 wait = new WebDriverWait(driver, 10);	
		 
	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Settings\")]"))).click();
		 Thread.sleep(1000);
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Clients \"]"))).click();
		 Thread.sleep(1000);
		 //Add client button
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Client\"]"))).click();
		 Thread.sleep(1000);
		 //institution name
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Institution Name\"]"))).sendKeys("Testing School");
		 Thread.sleep(1000);
		 //Phone no
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Institution Phone\"]"))).sendKeys("9898787676");
		 Thread.sleep(1000);
		 //Address
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@placeholder=\"Enter Institution address\"]"))).sendKeys("Testing Address 123");
		 Thread.sleep(1000);
		 //city
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Start typing to Search\"]"))).sendKeys("Adoni"+Keys.ENTER);
		 Thread.sleep(1000);
		 //no of students
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Student range\"]"))).sendKeys("0-10"+Keys.ENTER);
		 Thread.sleep(1000);
		 
		// Intitution type
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Institution Type\"]"))).sendKeys("School"+Keys.ENTER);
		 Thread.sleep(1000);
		 //size
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Team range\"]"))).sendKeys("0-10"+Keys.ENTER);
		 Thread.sleep(1000);
		 //first name
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"First Name\"]"))).sendKeys("Abi");
		 Thread.sleep(1000);
		 //Last name
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Last Name\"]"))).sendKeys("C");
		 Thread.sleep(1000);
		 //email
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Email\"]"))).sendKeys("abi@gmail.com");
		 Thread.sleep(1000);
		 //contact
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Contact\"]"))).sendKeys("9897687676");
		 Thread.sleep(1000);
		 //role
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Role\"]"))).sendKeys("Director"+Keys.ENTER);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/nav/div[1]/div[1]/div/div/div/div[3]")).click();
		 Thread.sleep(1000);
		 //email
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Institution Email\"]"))).sendKeys("Abiaas@gmail.com");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
		 Thread.sleep(1000);
		 
	}

}
