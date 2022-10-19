package a_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Browser Launch
		driver.manage().window().maximize(); //Maximize
		driver.get("http://facebook.com"); //URL Launch
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("aass");
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username");
		//driver.findElement(By.name("email")).sendKeys("gaurav2011yadav@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("nahi_bataunga");
		//driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.xpath("//input[@ type = 'text']")).sendKeys("kuch_bhi_nahi");
		//driver.findElement(By.linkText("Forgot username?")).click();
		//driver.findElement(By.partialLinkText("Forgot ")).click();
		
	}
	

}
