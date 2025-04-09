package pack_ScrollingandVerifyingElements;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingandVerifyingElementsInEmployeeList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//driver.get("https://www.google.com/");
		Thread.sleep(5000);	
		driver.manage().window().maximize();
		
		Thread.sleep(1000);	
		WebElement name1=driver.findElement(By.xpath("//div[@id='app']//input[@name='username']"));
		name1.sendKeys("Admin");
		Thread.sleep(1000);	
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	Thread.sleep(200);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(500);
		
		WebElement jobTitleDropdown = driver.findElement(By.xpath("//label[text()='Job Title']/following::div[contains(@class, 'oxd-select-wrapper')][1]//div[@class='oxd-select-text--after']"));
		jobTitleDropdown.click();
		
		Thread.sleep(500);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", jobTitleDropdown);
		
		//System.out.println(driver.manage().window().getSize());
		Thread.sleep(500);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

}

