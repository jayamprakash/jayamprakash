package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//MAXIMISE WINDOW
		driver.manage().window().maximize();
		
		//Click New Account
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		 String Title= driver.getTitle();
		 System.out.println(Title);
		 driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		
		//Add implicit wait
		Thread.sleep(2500);
		

		driver.close();
		

}
}

