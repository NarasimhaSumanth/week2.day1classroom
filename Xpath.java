package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

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

		// driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// click on Create lead

		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Legato1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Legato2");

		// driver.findElement(By.id("createLeadForm_firstName")).sendKeys("NarasimhaSumanth1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("NarasimhaSumanth2");

		// driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kodukula1");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_lastName')]")).sendKeys("kodukula2");

		// driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Create Lead')]")).click();

		driver.close();

	}

}
