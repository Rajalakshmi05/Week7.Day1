package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends Week2.day1.BaseClass {
@Test
	public void EditLead1() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUserName = driver .findElement(By.id("username"));
	     eleUserName.sendKeys("DemoSalesManager");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	     driver.findElement(By.xpath("//input[contains(@class,'decorativeSubmit')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		 driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='firstName']")).sendKeys("Rajalakshmi");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).click();				
		 String title = driver.getTitle();
		 System.out.println("Title of the page: " + title);
						if(driver.getTitle().contains("View Lead")){
				System.out.println("The title of the page is Correct");
			}else {
				System.out.println("The title of the page is null");
			} 
			boolean isTitleEnabled = driver.findElement(By.xpath("//title[text()='View Lead | opentaps CRM']")).isEnabled();
			System.out.println(isTitleEnabled);
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test Leaf Technologies - Edit changes");
			driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']")).click();		
			//Thread.sleep(10000);
			//driver.close();	
	}

}
