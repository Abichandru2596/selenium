package selenium;

//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
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


//String oldwindow =driver.getWindowHandle();

Set<String> handles=driver.getWindowHandles();

for (String newwindow : handles) {
	
	driver.switchTo().window(newwindow);	
	
}
WebDriverWait wait = new WebDriverWait(driver, 10);		
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Resources\")]"))).click();	

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"All Resources\")]"))).click();	



//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),\"Resources\")]"))));


WebElement resource=driver.findElement(By.xpath("//*[text()=\"Create Resource\"]"));
resource.click();


//click on image/video resource
driver.findElement(By.xpath("//*[text()=\"Add Resource Image/Video\"]")).click();
String file="D:\\testing\\Add family.png";

StringSelection selection=new StringSelection(file);

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

Robot robot;

	robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

}


	}


