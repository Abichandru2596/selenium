package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class professional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
driver.get("https://testing.app.eblity.com/signup/organisation");


//WebElement back=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[2]/div[1]/div/button/span/span"));

//back.click();
		
WebElement fn1=driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div/div[2]/div/div/div[1]/div/input"));
		fn1.sendKeys("abirami");
///                                        html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div/div[2]/div/div/div[1]/div/input
 

WebElement ln=driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div[2]/form/div/div[3]/div/div[2]/div/div/div[1]/div/input"));
ln.sendKeys("C");

	}

}
