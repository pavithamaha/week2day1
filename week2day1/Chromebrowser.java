package week2day1;
//import org.openqa.selenium.By;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//loading the URL and entering valid credentials
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//after login click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		String textone=driver.getTitle();
		System.out.println(textone);
		//after clicking CRMSFA create a lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		
		//create lead by filling the details
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("maha");
		driver.findElement(By.className("smallSubmit")).click();
		//editing the lead
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chris");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("   Brown");
		driver.findElement(By.className("smallSubmit")).click();
		//driver.close();
		
	}

}
