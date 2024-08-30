package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gowtham");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kannan");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
		/*
		 * WebElement sourceWE =
		 * driver.findElement(By.id("createLeadForm_dataSourceId")); Select sourceDD=
		 * new Select(sourceWE); sourceDD.selectByValue("LEAD_PARTNER"); WebElement
		 * ownershipWE = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 * Select ownershipDD = new Select(ownershipWE);
		 * ownershipDD.selectByValue("OWN_PARTNERSHIP");
	*/
		
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
	}
	
	/*
	 * private static Select selectByValue(String string) { // TODO Auto-generated
	 * method stub return null; }
	 */
}
