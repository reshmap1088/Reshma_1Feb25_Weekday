package assignment2TutorialsNinja;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollAndLoadMoreProducts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement name1=driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions act=new Actions(driver);
		act.moveToElement(name1).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Show AllDesktops']")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
	}

}
