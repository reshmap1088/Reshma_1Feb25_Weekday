package pack_DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EmployeeSerachWithDropDown {

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
		
		//WebElement element = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']//ancestor::div"));
		
	//	WebElement element= driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']//ancestor::div[@id='app']"));
	//	element.click();
		
		
	//	System.out.println(element.getText());
//	List<WebElement> options = driver.findElements(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']//ancestor::form//option"));
		
Thread.sleep(10);
	//WebElement ele=driver.findElement(By.xpath("//div[text()='Automaton Tester']//parent::div[@class='oxd-select-text oxd-select-text--focus']']"));
	//System.out.println(ele);
       // ele.click();

//3. Select Job Title from drop-down
WebElement jobTitleDropdown = driver.findElement(By.xpath("//label[text()='Job Title']/following::div[contains(@class, 'oxd-select-wrapper')][1]"));
jobTitleDropdown.click();

// Select 'QA Engineer' (change as per available option)
WebElement option = driver.findElement(By.xpath("//div[@role='option']//span[text()='QA Engineer']"));
option.click();

// 4. Click Search
driver.findElement(By.xpath("//button[@type='submit']")).click();

// 5. Verify results displayed
List<WebElement> results = driver.findElements(By.xpath("//div[@class='orangehrm-container']//div[contains(@class, 'oxd-table-card')]"));
//Assert.assertTrue(results.size() > 0, "No search results found!");



//label[text()='Job Title']//..//following-sibling::div//div[@class='oxd-select-wrapper']//div//following-sibling::div[@role='listbox']



//label[text()='Job Title']/../following-sibling::div//div[contains(@class,'oxd-select-text oxd-select-text')]/following-sibling::div[contains(@class,'oxd-select-dropdown')]

//label[text()='Job Title']//..//following-sibling::div//div[@class='oxd-select-wrapper']//div//following-sibling::div[@role='listbox']//div

}
}