package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends Week2.day1.BaseClass{

	@Test
	public  void CreateContact1() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement eleUserName = driver .findElement(By.id("username"));
			eleUserName.sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Create Contact")).click();
		  	driver.findElement(By.id("firstNameField")).sendKeys("Rajalakshmi");
			driver.findElement(By.id("lastNameField")).sendKeys("Mahalingam");
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Raji");
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Maha");
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CSE");
			driver.findElement(By.id("createContactForm_description")).sendKeys("Amazing leading Company");
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("raji5.maha@gmail.com");
			WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select wb = new Select(state);
			wb.selectByVisibleText("New York");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateContactForm_description")).clear();
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Amazing Selenium");
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			System.out.println("Title of Web Page is :"+driver.getTitle());
		
				
						
		
		
		
		
		


	}
}
