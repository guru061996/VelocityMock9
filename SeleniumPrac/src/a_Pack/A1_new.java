package a_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_new {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Browser Launch
		driver.manage().window().maximize(); //Maximize
		driver.get("https://www.facebook.com"); //URL insert
		Thread.sleep(4000); //delay of 4 sec
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(4000);
		Select s = new Select(day);
		Thread.sleep(4000);
	 s.selectByValue("6");
		
		
	}

}
