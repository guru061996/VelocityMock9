package a_Pack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Browser Launch
		driver.manage().window().maximize(); //Maximize
		driver.get("https://www.w3schools.com/sql/"); //Url Launch
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='trysql.asp?filename=trysql_select_all']")).click();
		System.out.println(driver.getCurrentUrl());
	
	}

}
