package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@role='button' and text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("firstname")).sendKeys("Gowtham");
		driver.findElement(By.name("lastname")).sendKeys("Kannan");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Password@1");
		WebElement dobDate = driver.findElement(By.name("birthday_day"));
		Select dobDays = new Select(dobDate);
		dobDays.selectByValue("23");
		WebElement dobMonth = driver.findElement(By.id("month"));
		Select dobMonthDD = new Select(dobMonth);
		dobMonthDD.selectByValue("1");
		WebElement dobYear = driver.findElement(By.id("year"));
	    Select dobYearDD = new Select(dobYear);
	    dobYearDD.selectByValue("1993");
	    driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='2']")).click();
	
	
	}

}
