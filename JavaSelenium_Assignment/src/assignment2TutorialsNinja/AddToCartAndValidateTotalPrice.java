package assignment2TutorialsNinja;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartAndValidateTotalPrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.name("search"));
		search.sendKeys("MacBook");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='input-group-btn']//button[@type='button']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='button-group']//button[contains(@onclick,'cart.add')][1]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='row']//following-sibling::div[@class='col-sm-3']//button[@type='button']//child::span")).click();
		
		
		
		Thread.sleep(500);
	//	driver.findElement(By.xpath("//div[@id='cart']//button[@type='button']//child::span")).click();
		
		
		driver.findElement(By.xpath("//p[@class='text-right']//child::a//strong[text()='View Cart']")).click();
		
		Thread.sleep(500);
		String ele=driver.findElement(By.xpath("//table//tbody//tr//td//div[@class='input-group btn-block']//input[@type='text' and @class='form-control']")).getText();

		Thread.sleep(500);
		String s=driver.findElement(By.xpath("//table//tbody//tr//child::td[4]")).getText();
		
	//	int total=(Integer.parseInt("ele")) * (Integer.parseInt("s"));
		
	//	System.out.println(total);
		
	}

}
