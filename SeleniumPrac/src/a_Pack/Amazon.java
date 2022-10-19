package a_Pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); // Browser Launch
	driver.manage().window().maximize(); // Maximize
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	Thread.sleep(3000);
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);	
	WebElement singnin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions act= new Actions (driver);
	act.moveToElement(singnin).click().perform();// opening sign in page
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Malpara Mohammed  Bilal");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("9930275240");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("12@900@345");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	Thread.sleep(10000);
	//WebElement frame = driver.findElement(By.id("CaptchaFrame"));
	Thread.sleep(5000);
	//driver.switchTo().frame(frame);
	//Thread.sleep(5000);
	WebElement click = driver.findElement(By.xpath("//button[text()='Solve Puzzle']"));
	act.click(click).perform();
	
}
}
