package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		

		WebDriver driver=new ChromeDriver();
		
driver.get("https://testing.app.eblity.com");
WebElement register=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/a/span/span"));
register.click();


Set<String> handles=driver.getWindowHandles();

for (String newwindow : handles) {
	
	driver.switchTo().window(newwindow);	
	
}



WebElement pro=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div/div/div"));
pro.click();

Set<String> handles1=driver.getWindowHandles();

for (String newwindows : handles1) {
	
	driver.switchTo().window(newwindows);
	
}


WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/button/span/span"));
email.click();


Set<String> handles2=driver.getWindowHandles();

for (String new2 : handles2) {
	driver.switchTo().window(new2);
	
}


WebElement fn=driver.findElement(By.id("input-697"));
fn.sendKeys("Abirami");


WebElement ln=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[2]/div[2]/form/div/div[3]/div/div[2]/div/div/div[1]/div/input"));
ln.sendKeys("C");

	}

}
