package selenium;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class example {

	static String loginresult, admin,aadmin,master,amaster,medit,mdelete,client,aclient,clientmaster,aclientmaster,cmedit,cdelete,eresource,cmdelete,resource,servicesdetail,service,aservice,permission;
	public static void main(String[] args) throws InterruptedException, RowsExceededException, WriteException, IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Admin\\Desktop\\New folder\\Fullflow.xls");
		WritableWorkbook wb;
		WritableSheet sht;
		wb = Workbook.createWorkbook(file);
		  sht = wb.createSheet("Master Data Result", 0);
		  sht.addCell(new Label(1, 0, "Testing Result")); 
		  sht.addCell(new Label(0, 0, "Testing Field name")); 
		  sht.addCell( new Label(0, 1, "Login Button"));
		  sht.addCell( new Label(0, 2, "AllResources,My Resource, Bookmarked Resources"));
		  sht.addCell( new Label(0, 3, "Resources Screen Elements"));
		  sht.addCell( new Label(0, 4, "Admin menu"));
		  sht.addCell( new Label(0, 5, "Client menu"));
		  sht.addCell(new Label(0, 6, "Client_Edit")); 
		  sht.addCell(new Label(0, 7, "Client_Delete"));
		  sht.addCell(new Label(0, 8, "Masters menu"));
		  sht.addCell(new Label(0, 9, "Add Master"));
		  sht.addCell(new Label(0, 10, "Masters_Edit"));
		  sht.addCell(new Label(0, 11, "Master_Delete"));
		  sht.addCell(new Label(0, 12, "Client Master menu"));
		  sht.addCell(new Label(0, 13, "Add Client_Master "));
		  sht.addCell(new Label(0, 14, "ClientMaster_Edit"));
		  sht.addCell(new Label(0, 15, "ClientMaster_Delete"));
		  sht.addCell(new Label(0, 16, "Permission Management"));
		  sht.addCell(new Label(0, 17, "Service Provider menu"));
		  sht.addCell(new Label(0, 18, "Add Service provider"));
		  sht.addCell(new Label(0, 19, "Service provider_Edit, Delete, Block, Dedail"));
		  sht.addCell(new Label(0, 20, ""));

		  
		  
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
Set<String> availableWindows1 = driver.getWindowHandles(); 
if (!availableWindows1.isEmpty()) { 
     for (String windowId : availableWindows1) {

String switchedWindowTitle1=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle1);


if(switchedWindowTitle1.contains("Login")) 
	
loginresult="Login button is clickable and redirect to the Corresponding page.";
else
		loginresult="Login button is not clickable and It's redirect to the corresponding page";
}
     }
sht.addCell( new Label(1, 1,loginresult ));

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Settings\")]"))).click();
Thread.sleep(1000);


//Admin
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Admins\")]"))).click();
Thread.sleep(1000);

Set<String> availableWindows2 = driver.getWindowHandles(); 
if (!availableWindows2.isEmpty()) { 
     for (String windowId : availableWindows2) {

String switchedWindowTitle2=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle2);

if(switchedWindowTitle2.contains("Admin List")) 
	admin=("It redirect to the corresponding page");
else
		admin=("It shouldn't redirect to the Corresponding field");
}
     }

WebElement addadmin=driver.findElement(By.xpath("//*[text()=\"Add Admin\"]"));
addadmin.click();
Thread.sleep(1000);

//Add Admin
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div/form/div/div[1]/div/div[2]/div/div/div[1]/div/input"))).sendKeys("Abirami");
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div/form/div/div[2]/div/div[2]/div/div/div[1]/div/input"))).sendKeys("C");
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div/form/div/div[3]/div/div[2]/div/div/div[1]/div/input"))).sendKeys("abbbiarvid25@gmail.com");
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div/form/div/div[4]/div/div[2]/div/div/div[1]/div/input"))).sendKeys("9876943456");
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();


Set<String> availableWindows14 = driver.getWindowHandles(); 
if (!availableWindows14.isEmpty()) { 
     for (String windowId : availableWindows14) {

String switchedWindowTitle14=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle14);

if(switchedWindowTitle14.contains("Admin Add")) 
	aadmin=("Failure to add new admin");
else
		aadmin=("New admin added successfully");
}
     }

sht.addCell( new Label(1, 4, admin+". "+aadmin));

//Masters
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Masters\")]"))).click();
Thread.sleep(3000);
Set<String> availableWindows3= driver.getWindowHandles(); 
if (!availableWindows3.isEmpty()) { 
     for (String windowId : availableWindows3) {
    	 Thread.sleep(3000);
String switchedWindowTitle3=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle3);
Thread.sleep(3000);
if(switchedWindowTitle3.contains("Masters List")) 
	master=("It's to redirect the corresponding screen");
else
		master=("Failure to redirect the corresponding screen");
}
     }
sht.addCell(new Label(1, 8, master));

//Resources type
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'/admin/details/1')]"))).click();

WebElement addresourcestype=driver.findElement(By.xpath("//*[text()=\"Add Resource Type\"]"));
addresourcestype.click();
Thread.sleep(3000);

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Resource Type Name\"]"))).sendKeys("Activity abi");
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
Thread.sleep(3000);


Set<String> availableWindows4 = driver.getWindowHandles(); 
if (!availableWindows4.isEmpty()) { 
     for (String windowId : availableWindows4) {

String switchedWindowTitle4=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle4);

if(switchedWindowTitle4.contains("Add Resource Type")) 
	amaster=("Failure to add new Master");
else
		amaster=("New Master type added successfully");
}
     }
sht.addCell(new Label(1, 9, amaster));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Masters\")]"))).click();
Thread.sleep(3000);

//Resources type
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'/admin/details/1')]"))).click();
//edit
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Resource Type Name\"]"))).sendKeys("1");
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();
Thread.sleep(3000);
Set<String> availableWindows5 = driver.getWindowHandles(); 
if (!availableWindows5.isEmpty()) { 
     for (String windowId : availableWindows5) {

String switchedWindowTitle5=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle5);

if(switchedWindowTitle5.contains("Edit Resource Type")) 
	medit=("Failure to Edit Master");
else
		medit=( "Master type Edited successfully");
}
     }
sht.addCell(new Label(1, 10, medit));


//delete
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Delete\"]"))).click();
Thread.sleep(3000);wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();
mdelete=" Delete the Master Data successfully";
sht.addCell(new Label(1, 11, mdelete));
//Set<String> availableWindows6 = driver.getWindowHandles(); 
//if (!availableWindows6.isEmpty()) { 
//     for (String windowId : availableWindows6) {
//
//String switchedWindowTitle6=driver.switchTo().window(windowId).getTitle();
//String mdelete;
//if(switchedWindowTitle6.contains("edit Resource Type")) 
//	mdelete=("Failure to Edit Master");
//else
//	mdelete=( "Master type Edited successfully");
//}
//     }
//


Thread.sleep(3000);
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

sht.addCell(new Label(1,5,client));

//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),\"Add Client\")]"))).click();
//
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,\"Enter Institution Name\")]"))).sendKeys("Abirami");
//
//WebElement dropdown=driver.findElement(By.xpath("//input[contains(@placeholder,\"Start typing to Search\")]"));
//           
//Select dd=new Select(dropdown); 
//dd.selectByValue("Adoni - India(IN)");
//
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[contains(@placeholder,\"Enter Institution address\")]"))).sendKeys("kanpa nagar, thiruppathur");
//
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,\"Enter Institution Phone\")]"))).sendKeys("9876765654");
//
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,\"Enter Institution Email\")]"))).sendKeys("abuuarvid25@gmail.com");
//
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,\"First Name\")]"))).sendKeys("Abirami");
//
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,\"Last Name\")]"))).sendKeys("Abirami");
//
//
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Email\"]"))).sendKeys("abuuarvid25@gmail.com");
//
//
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Contact\"]"))).sendKeys("9878767676");
//	
//
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,\"Last Name\")]"))).sendKeys("Abirami");
//Set<String> availableWindows7 = driver.getWindowHandles(); 
//if (!availableWindows7.isEmpty()) { 
//     for (String windowId : availableWindows7) {
//
//String switchedWindowTitle7=driver.switchTo().window(windowId).getTitle();
//System.out.println("Title"+switchedWindowTitle7);
//
//if(switchedWindowTitle7.contains("Add Client")) 
//	aclient=("Failure to Add Client");
//else
//	aclient=( "Add New Client successfully");
//}
//     }
//sht.addCell( new Label(1, 6, aclient));

driver.findElement(By.xpath("//*[text()=\"Delete\"]")).click();    
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();
cdelete=" Delete the Master Data successfully";
sht.addCell(new Label(1, 7, cdelete));
//Client Master

driver.findElement(By.xpath("//*[text()=\" Client Masters \"]")).click();
Set<String> availableWindows8 = driver.getWindowHandles(); 
if (!availableWindows8.isEmpty()) { 
     for (String windowId : availableWindows8) {
String switchedWindowTitle8=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle8);
Thread.sleep(1000);
if(switchedWindowTitle8.contains("Masters List")) 
	clientmaster=("It Redirect to the Corresponding screen");
	else
		clientmaster=( "Failure to redirect the Corresponding screen");
	}
	     }
sht.addCell(new Label(1, 12, clientmaster));
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

if(switchedWindowTitle9.contains("Add Class")) 
	aclientmaster=("Failure to Add Client");
	else
		aclientmaster=( "Add New Client successfully");
	}
	     }
sht.addCell(new Label(1, 13, aclientmaster));
driver.findElement(By.xpath("//*[text()=\" Client Masters \"]")).click();

driver.findElement(By.xpath("//a[contains(@href,'/admin/clientMasters/details/2')]")).click();

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter class Name\"]"))).sendKeys("");
Thread.sleep(2000);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter class Name\"]"))).sendKeys("A");

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Save Changes\"]"))).click();
Thread.sleep(3000);
Set<String> availableWindows10 = driver.getWindowHandles(); 
if (!availableWindows10.isEmpty()) { 
     for (String windowId : availableWindows10) {

String switchedWindowTitle10=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle10);


if(switchedWindowTitle10.contains("Edit Class")) 
	cmedit=("Failure to Edit ClientMaster");
else
		cmedit=( "ClientMaster type Edited successfully");
}
     }
sht.addCell(new Label(1, 14, cmedit));

driver.findElement(By.xpath("//*[text()=\" Client Masters \"]")).click();

driver.findElement(By.xpath("//a[contains(@href,'/admin/clientMasters/details/2')]")).click();


wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Delete\"]"))).click();
Thread.sleep(3000);
try{
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Yes\"]"))).click();
 cmdelete = " Delete the ClientMaster Data successfully";

sht.addCell(new Label(1, 15, cmdelete));
}catch (org.openqa.selenium.NoSuchElementException e) {
	
	// TODO: handle exception
}


driver.findElement(By.xpath("//*[text()=\" Permission Management \"]")).click();
Thread.sleep(3000);
Set<String> availableWindows11 = driver.getWindowHandles(); 
if (!availableWindows11.isEmpty()) { 
     for (String windowId : availableWindows11) {

String switchedWindowTitle11=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle11);

if(switchedWindowTitle11.contains("Admin Permission Management")) 
	permission=("It Redirect to the corresponding page");
else
	permission=( "Failure to redirect the corresponding screen");
}
     }
sht.addCell(new Label(1, 16, permission));



wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Service Providers \"]"))).click();
Thread.sleep(3000);

Set<String> availableWindows13 = driver.getWindowHandles(); 
if (!availableWindows13.isEmpty()) { 
     for (String windowId : availableWindows13) {

String switchedWindowTitle13=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle13);
Thread.sleep(3000);
if(switchedWindowTitle13.contains("Service Providers")) 
	service=("It Redirect to the corresponding page");
else
	service=( "Failure to redirect the corresponding screen");
}
     }
sht.addCell(new Label(1, 17, service));


	//Add serviceprovider
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Add Service provider\"]"))).click();
	Thread.sleep(1000);
	//first name
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter first Name\"]"))).sendKeys("Abirami");
	Thread.sleep(1000);
	//last name
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter last Name\"]"))).sendKeys("C");
	Thread.sleep(1000);
	//email
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Email\"]"))).sendKeys("AbiAnu123@gmail.com");
	Thread.sleep(1000);
	//phone
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter Phone\"]"))).sendKeys("8978788794");
	Thread.sleep(1000);
	//city
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select City\"]"))).sendKeys("Adoni"+Keys.ENTER);
	Thread.sleep(1000);
	//role
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Select Roles\"]"))).sendKeys("Principal"+Keys.ENTER);
	Thread.sleep(1000);
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Submit\"]"))).click();
	Thread.sleep(500);

	Set<String> availableWindows12 = driver.getWindowHandles(); 
	if (!availableWindows12.isEmpty()) { 
	     for (String windowId : availableWindows12) {

	String switchedWindowTitle12=driver.switchTo().window(windowId).getTitle();
	System.out.println("Title"+switchedWindowTitle12);

	if(switchedWindowTitle12.contains("Add Service provider")) 
		aservice=("Failure to add Service provider");
	else
		aservice=( "Successfully add a new service provider");
	}
	     }
	 sht.addCell(new Label(1, 18, aservice));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\" Service Providers \"]"))).click();
	 Thread.sleep(1000);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/main/div/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[9]/button/span/i"))).click();	
	 Thread.sleep(3000);
	
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Edit\"]"))).click();	
	 Thread.sleep(3000);
	 servicesdetail="All the buttons are clickable";
	 sht.addCell(new Label(1, 19,servicesdetail));
	 
//resource
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"Resources\")]"))).click();	
Thread.sleep(3000);

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),\"All Resources\")]"))).click();	


Set<String> availableWindows = driver.getWindowHandles(); 
if (!availableWindows.isEmpty()) { 
   for (String windowId : availableWindows) {

String switchedWindowTitle=driver.switchTo().window(windowId).getTitle();
System.out.println("Title"+switchedWindowTitle);

if(switchedWindowTitle.contains("Resource List")) 
	resource=("Successfully redirect to the Corresponding screen");
else
	resource=("Failure to Redirect");
}
   }

sht.addCell( new Label(1, 2, resource));

//Resource element
driver.findElement(By.xpath("//input[@placeholder=\"Select Skills\"]")).sendKeys("Emotional"+Keys.ENTER);

driver.findElement(By.xpath("//input[@placeholder=\"Select Age Group\"]")).sendKeys("0-3"+Keys.ENTER);

driver.findElement(By.xpath("//input[@placeholder=\"Select Tags\"]")).sendKeys("Game"+Keys.ENTER);

driver.findElement(By.xpath("//input[@placeholder=\"Select Resource Types\"]")).sendKeys("Videos"+Keys.ENTER);

driver.findElement(By.xpath("//*[text()=\"More Filters\"]")).click();
driver.findElement(By.xpath("//input[@placeholder=\"Select Creator\"]")).sendKeys("Client Owner"+Keys.ENTER);
driver.findElement(By.xpath("//input[@placeholder=\"Select Countries\"]")).sendKeys("India"+Keys.ENTER);

driver.findElement(By.xpath("//input[@placeholder=\"Select Languages\"]")).sendKeys("English"+Keys.ENTER);
eresource="All the resource Elements are clickable";
sht.addCell( new Label(1, 3, eresource));



//sht.addCell( new Label(1, 5, admin+" "+aadmin));
//sht.addCell( new Label(1, 6, client+""+aclient));
//sht.addCell(new Label(1, 7, "Client_Edit")); 
//sht.addCell(new Label(1, 8, "Client_Delete"));
//
//



wb.write();
wb.close();
driver.quit();


	}
}
