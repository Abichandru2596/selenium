package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EblityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
driver.get("https://testing.app.eblity.com");


WebElement username=driver.findElement(By.id("input-18"));
username.sendKeys("yash.chandani@codenicely.in");

WebElement password=driver.findElement(By.id("input-22"));
password.sendKeys("Reliance@98");

//WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/button/span"));
//login.click();
WebElement forgotpassword=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/a"));
forgotpassword.click();

//String oldwindow=driver.getWindowHandle();

Set<String> handles=driver.getWindowHandles();

for (String newwindow : handles) {
	
	driver.switchTo().window(newwindow);	
	
}


//driver.get("https://testing.app.eblity.com/forgot-password");

WebElement btn=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div/div[1]/div/input"));

btn.sendKeys("welcome");


WebElement fsubmit=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[2]/form/button/span"));
fsubmit.click();

WebElement gologin=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[2]/a/span/span"));
gologin.click();



//WebElement username1=driver.findElement(By.id("input-18"));
username.sendKeys("yash.chandani@codenicely.in");

//WebElement password1=driver.findElement(By.id("input-22"));
password.sendKeys("Reliance@98");

WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/button/span"));
login.click();
	
	
	
driver.close();
	
	
	}
	
	

}
