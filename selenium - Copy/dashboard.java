package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashboard {
	static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
driver.get("https://testing.app.eblity.com");


driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

WebElement username=driver.findElement(By.id("input-18"));
username.sendKeys("owner@codenicley.in");

WebElement password=driver.findElement(By.id("input-22"));
password.sendKeys("cntest@123");

WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/button/span"));
login.click();
TakesScreenshot screenshot=(TakesScreenshot)  driver;
File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
File destinationfile=new File("D://sample.png");
org.openqa.selenium.io.FileHandler.copy(sourcefile,destinationfile);
//FileHandler.Copy(sourcefile,destinationfile);



 
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
 
 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()=\"Add Resource Image/Video\"]")))).click();
 Thread.sleep(500);
 
 String myfile="D:\\testing\\123.png";
 
 StringSelection selection=new StringSelection(myfile);
 
 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
 
 Robot robot=new Robot();
 robot.setAutoDelay(3000);
 robot.keyPress(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_V);
 robot.keyRelease(KeyEvent.VK_CONTROL);
 robot.keyRelease(KeyEvent.VK_V);
 robot.keyPress(KeyEvent.VK_ENTER);
 robot.keyRelease(KeyEvent.VK_ENTER);
 
    Thread.sleep(5000);  
 
 //Title
 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div/form/div/div[1]/div[3]/div/div[2]/div/div/div[1]/div/input"))).sendKeys("Title");	
 Thread.sleep(500);
 //description
 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/div[2]/div/form/div/div[1]/div[4]/div/div[2]/div/div/div[1]/div/textarea"))).sendKeys("des");
 Thread.sleep(500);
 //Instruction
 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[2]/div/div/div[1]/div/textarea"))).sendKeys("instruction");
 Thread.sleep(500);
 //resource type
 WebElement sel=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Select Resource Type']"))));
 sel.sendKeys("Home Activities");
 Thread.sleep(500);
 
 
 //driver.findElement(By.xpath("//*[text()=\"Everyone\"]")).click();
 
 //WebElement sel3=driver.findElement(By.xpath("//input[@placeholder='Select Countries']"));
 //sel3.sendKeys("India"+Keys.ENTER);
 	
 Thread.sleep(500);
 //tags
 WebElement sell=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Select Tags']"))));
 sell.sendKeys("Game"+Keys.ENTER);
 Thread.sleep(500);
 
 //Age
 WebElement sel2=(driver.findElement(By.xpath("//input[@placeholder='Select Age Group']")));
 sel2.sendKeys(String.valueOf("5-7"+Keys.ENTER));
 Thread.sleep(500);
 
 //source
 
 WebElement sel5=(driver.findElement(By.xpath("//input[@placeholder='Enter Source']")));
 sel5.sendKeys("source");
 Thread.sleep(500);
 
 //language
 WebElement sel6=(driver.findElement(By.xpath("//input[@placeholder='Select Language']")));
 sel6.sendKeys("English"+Keys.ENTER);
 Thread.sleep(500);
 driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/nav/div[1]/div[1]/div/div/div/div[3]")).click();
 Thread.sleep(500);
 //upload file
 driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div/form/div/div[2]/div[4]/div[1]/div/div")).click();
 
 String myfile1="D:\\testing\\123.png";
 
 StringSelection selection1=new StringSelection(myfile1);
 
 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null);
 
 Robot robot1=new Robot();
 robot1.setAutoDelay(3000);
 robot1.keyPress(KeyEvent.VK_CONTROL);
 robot1.keyPress(KeyEvent.VK_V);
 robot1.keyRelease(KeyEvent.VK_CONTROL);
 robot1.keyRelease(KeyEvent.VK_V);
 robot1.keyPress(KeyEvent.VK_ENTER);
 robot1.keyRelease(KeyEvent.VK_ENTER);
 Thread.sleep(5000);
 WebElement sel1=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Select Skills']"))));
 sel1.sendKeys("Maths"+Keys.ENTER);
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("//span[contains(text(),\"Submit\")]")).click();
 
 Thread.sleep(1000);
 Alert alert = driver.switchTo().alert();		
 
 // Capturing alert message.    
 String alertMessage= driver.switchTo().alert().getText();		
 		
 // Displaying alert message		
 System.out.println(alertMessage);	
 Thread.sleep(5000);
 		
 // Accepting alert		
 alert.accept();	
 try {
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),\"I Agree\")]"))).click();
 
	
} catch (NoSuchElementException e) {
	System.out.println(e);
}
	} 
     


     }
	


	
     

