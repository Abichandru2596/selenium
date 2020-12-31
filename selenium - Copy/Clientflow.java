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

public class Clientflow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String client,aclient = null;
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
driver.get("https://testing.app.eblity.com");


driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

WebElement username=driver.findElement(By.id("input-18"));
username.sendKeys("yash.chandani@codenicely.in");

WebElement password=driver.findElement(By.id("input-22"));
password.sendKeys("Reliance@98");

WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/button/span"));
login.click();



//String oldwindow =driver.getWindowHandle();

Set<String> handles=driver.getWindowHandles();

for (String newwindow : handles) {
	
	driver.switchTo().window(newwindow);	
	System.out.println("new window"+ newwindow+"  ");
}
WebDriverWait wait = new WebDriverWait(driver, 10);	

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Settings\")]"))).click();
Thread.sleep(1000);

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Clients\")]"))).click();
Thread.sleep(3000);
Set<String> availableWindows6 = driver.getWindowHandles(); 
if (!availableWindows6.isEmpty()) { 
     for (String windowId : availableWindows6) {

String switchedWindowTitle6=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle6);

if(switchedWindowTitle6.contains("Clients")) 
	client=("It's redirect to the corresponding page");
else
	client=( "Failure to redirect");
}
     }

//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();




wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),\"Add Client\")]"))).click();
//institution name
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Institution Name\"]"))).sendKeys("Institution");
Thread.sleep(1000);
//Phone no
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Institution Phone\"]"))).sendKeys("9898787656");
Thread.sleep(1000);
//Address
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@placeholder=\"Enter Institution address\"]"))).sendKeys("chennai");
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
////first name
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"First Name\"]"))).sendKeys(first);
//Thread.sleep(1000);
////Last name
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Last Name\"]"))).sendKeys(last);
//Thread.sleep(1000);
////email
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Email\"]"))).sendKeys(email1);
//Thread.sleep(1000);
////contact
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Contact\"]"))).sendKeys(contact);
//Thread.sleep(1000);
////role
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Role\"]"))).sendKeys(role);
//Thread.sleep(1000);
//
driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/nav/div[1]/div[1]/div/div/div/div[3]")).click();
Thread.sleep(1000);
//email
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Institution Email\"]"))).sendKeys("asdfg123@gmail.com");
Thread.sleep(1000);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
Thread.sleep(3000);

//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,\"Last Name\")]"))).sendKeys("Abirami");
Set<String> availableWindows7 = driver.getWindowHandles(); 
if (!availableWindows7.isEmpty()) { 
     for (String windowId : availableWindows7) {

String switchedWindowTitle7=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle7);

if(switchedWindowTitle7.contains("Add Client")) 
	aclient=("Failure to Add Client");
else
	aclient=( "Add New Client successfully");
}
     }
System.out.println(aclient);

	}

}
