package a_Pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Browser Launch
		driver.manage().window().maximize(); //Maximize
		driver.get("http://practice.cybertekschool.com/dropdown"); //URL insert
		Thread.sleep(2000);
		WebElement lang = driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s = new Select(lang);
		s.selectByIndex(1); //JavaScript must get selected
		s.selectByValue("python"); //Python must get selected
		s.selectByVisibleText("C#"); //C#
	List <WebElement> l =	s.getAllSelectedOptions();
    for(int i = 0; i<l.size();i++) {
    	System.out.println(l.get(i).getText());
    }
	}

}
