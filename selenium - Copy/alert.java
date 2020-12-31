package selenium;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		
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
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Resources\")]"))).click();	
Thread.sleep(3000);

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"All Resources\")]"))).click();	



//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),\"Resources\")]"))));


WebElement resource=driver.findElement(By.xpath("//*[text()=\"Create Resource\"]"));

resource.click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();

	}

}
