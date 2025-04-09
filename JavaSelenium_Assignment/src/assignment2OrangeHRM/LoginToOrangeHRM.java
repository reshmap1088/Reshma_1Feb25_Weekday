package assignment2OrangeHRM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToOrangeHRM {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://www.google.com/");
	Thread.sleep(5000);	
	driver.manage().window().maximize();
		
		//div[@id='app']//div[@class='oxd-form-row']//input[@name='username']
		//div[@id='app']//input[@name='username']
		//input[@name='username']//ancestor::div[@id='app']
		//input[@name='username']//parent::div
		//input[@name='username']//parent::div[1]
		//input[@name='username']//..
		
	//	WebElement name=driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']//parent::div"));

	WebElement name=driver.findElement(By.xpath("//div[@id='app']//input[@name='username']"));
	name.sendKeys("Reshma");
	Thread.sleep(1000);	
	driver.findElement(By.name("password")).sendKeys("reshm123");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(3000);
	java.io.File Scrfile=(java.io.File) (((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
	FileUtils.copyFile(Scrfile,new File("C:\\Users\\Lenovo\\Documents\\TestoMeter\\screensh.png"));
	
	Thread.sleep(2000);
	WebElement msg = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
	System.out.println("Error message displayed on the screen :"+msg.getText());
	Thread.sleep(1000);	
	WebElement name1=driver.findElement(By.xpath("//div[@id='app']//input[@name='username']"));
	name1.sendKeys("Admin");
	Thread.sleep(1000);	
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

}
