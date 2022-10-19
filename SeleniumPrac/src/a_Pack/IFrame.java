package a_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // Maximize
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
		TargetLocator tl = driver.switchTo(); // Switchto RT is TargetLocator
		//locating iframe and storing in WebElement Interface
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//3 types of arguments can be provided in .frame method
		//1st is Index in Integer 2nd is String of attribute value and 3rd is WebElement
		//we will use 3rd type of argument
		tl.frame(4);//now the focus is switched to our required iframe
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	}

}
