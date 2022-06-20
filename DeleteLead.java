package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends Week2.day1.BaseClass{
@Test
	public void DeleteLead1() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String leadId = driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]"))
				.getText();
		System.out.println("leadId is :" + leadId);

		driver.findElement(By.xpath(
				"(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]"))
				.click();

		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		if (driver.getTitle().contains("TestLeaf")) {
			System.out.println("The Title is Correct");
		} else {
			System.out.println("Nothing");
		}
		// driver.close();

	}

}
