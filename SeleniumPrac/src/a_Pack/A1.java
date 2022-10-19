package a_Pack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser Launch
	    driver.manage().window().maximize();
	    Thread.sleep(2000);	
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(1000);
	
		
		// Selenium Ka Focus Child Pe laana hai to switch karna padhe ga
		ArrayList <String> arr = new ArrayList <String>(driver.getWindowHandles());	
		driver.switchTo().window(arr.get(1));// yha pe selenium ka focus switch hoga child p 
		Thread.sleep(1000);
		
		WebElement tryit =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));	
		
		driver.switchTo().frame(tryit);// Try it button p aaya selenium ka focus
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
	      driver.switchTo().alert().accept();// ok p click kare ga
	      Thread.sleep(2000);      
	driver.switchTo().defaultContent();    
	   
//      driver.switchTo().parentFrame();// parend window p aaye ga selenium ka focus
     	Thread.sleep(2000);
//	// mujhe action perform karna hai parent p
     	
		driver.findElement(By.xpath("//a[@onclick='openMenu()']"));// Action perfrom on parent
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
		Thread.sleep(3000);
		// main page p jaana hai
		
		driver.switchTo().window(arr.get(0));
		
	}

}
