package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.write.Label;

public class ServiceProvidertest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverWait wait;
		WebDriver driver;	
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		
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
		 Thread.sleep(3000);
		// Serviceprovider
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Service Providers \"]"))).click();
			//Thread.sleep(1000);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[9]/button/span/i"))).click();
			//Thread.sleep(1000);
			

driver.findElement(By.xpath("//*[text()=\" Client Masters \"]")).click();
Set<String> availableWindows8 = driver.getWindowHandles(); 
if (!availableWindows8.isEmpty()) { 
     for (String windowId : availableWindows8) {
String switchedWindowTitle8=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle8);
Thread.sleep(1000);
String clientmaster;
if(switchedWindowTitle8.contains("Masters List")) 
	clientmaster=("It Redirect to the Corresponding screen");
	else
		clientmaster=( "Failure to redirect the Corresponding screen");
	}
	     }
//sht.addCell(new Label(14, 13, clientmaster));

driver.findElement(By.xpath("//a[contains(@href,'/admin/clientMasters/details/2')]")).click();


WebElement addresourcestyp=driver.findElement(By.xpath("//*[text()=\"Add Class\"]"));
addresourcestyp.click();
Thread.sleep(1000);

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Client\"]"))).sendKeys("Lily School"+Keys.ENTER);

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Grade\"]"))).sendKeys("Grade 1"+Keys.ENTER);

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter class Name\"]"))).sendKeys("E");

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
Thread.sleep(1000);

Set<String> availableWindows9 = driver.getWindowHandles(); 
if (!availableWindows9.isEmpty()) { 
     for (String windowId : availableWindows9) {
String switchedWindowTitle9=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle9);
Thread.sleep(1000);
String aclientmaster;
if(switchedWindowTitle9.contains("Add Class")) 
	aclientmaster=("Failure to Add Client");
	else
		aclientmaster=( "Add New Client successfully");
	}
	     }
//sht.addCell(new Label(15, 14, aclientmaster));
driver.findElement(By.xpath("//*[text()=\" Client Masters \"]")).click();

driver.findElement(By.xpath("//a[contains(@href,'/admin/clientMasters/details/2')]")).click();

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Grade\"]"))).sendKeys("Grade 2"+Keys.ENTER);

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter class Name\"]"))).clear();

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter class Name\"]"))).sendKeys("A");

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();
Thread.sleep(3000);
Set<String> availableWindows10 = driver.getWindowHandles(); 
if (!availableWindows10.isEmpty()) { 
     for (String windowId : availableWindows10) {

String switchedWindowTitle10=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle10);

String cmedit;
if(switchedWindowTitle10.contains("Edit Class")) 
	cmedit=("Failure to Edit ClientMaster");
else
		cmedit=( "ClientMaster type Edited successfully");
}
     }
//sht.addCell(new Label(16, 15, cmedit));

driver.findElement(By.xpath("//*[text()=\" Client Masters \"]")).click();

driver.findElement(By.xpath("//a[contains(@href,'/admin/clientMasters/details/2')]")).click();


wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Delete\"]"))).click();
Thread.sleep(3000);
try{
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();
String cmdelete = " Delete the ClientMaster Data successfully";

//sht.addCell(new Label(17, 16, cmdelete));
}catch (org.openqa.selenium.NoSuchElementException e) {
	
	// TODO: handle exception
}



	}

}
