package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {

	public static void main(String[] args) {

		// Setup the driver

		WebDriverManager.chromedriver().setup();

		// Launch the browser

		ChromeDriver driver = new ChromeDriver();

		// Load the URL

		driver.get("http://leaftaps.com/opentaps/");

		// Maximize the browser

		driver.manage().window().maximize();

		// get the title

		String title = driver.getTitle();
		System.out.println(title);

		// enter username

		WebElement findElement = driver.findElement(By.id("username"));

		findElement.sendKeys("DemoSalesManager");

		// enter password

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// click on login

		driver.findElement(By.className("decorativeSubmit")).click();

		// click on CRM/SFA link

		driver.findElement(By.linkText("CRM/SFA")).click();

		// click on Leads tab

		driver.findElement(By.linkText("Leads")).click();

		// click on Create lead

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Legato1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("NarasimhaSumanth1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kodukula1");

		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select dropdown = new Select(dd);

		dropdown.selectByIndex(1);
		// WebElement p = dropdown.getFirstSelectedOption();
		// String text = p.getText();
		// System.out.println(text);

		// driver.findElement(By.className("smallSubmit")).click();

		// driver.close();

	}

}
