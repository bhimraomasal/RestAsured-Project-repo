package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Classnew {
	WebDriver driver=new ChromeDriver();

	@Test
	public void display()
	{
		driver.navigate().to("https://www.google.com");
		  System.out.println("Hello");
		
	}

}
