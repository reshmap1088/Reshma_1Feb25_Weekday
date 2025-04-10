package assignment2TutorialsNinja;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownProductSorting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement name1=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		Actions act=new Actions(driver);
		act.moveToElement(name1).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();
		
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='input-sort']"));
		ele.click();
		
		List<WebElement> dropdown=driver.findElements(By.xpath("//select[@id='input-sort']//option"));
		
		Thread.sleep(3000);
		
		for(WebElement option:dropdown)
		{
			String v=option.getText();
			System.out.println(v);
			if(v.equals("Price (Low > High)"))
			{
				option.click();
				break;
			}
		}
	}

}
