
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTesting1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		cd.manage().window().maximize();
		System.out.println(cd.getTitle());
		System.out.println(cd.getCurrentUrl());
		
		WebElement UserName=cd.findElement(By.name("email"));
		UserName.sendKeys("veera Travels");
		//cd.getPageSource();
		//cd.close();
	}

}
