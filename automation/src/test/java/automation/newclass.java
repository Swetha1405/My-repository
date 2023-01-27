package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("wedriver.gecko.driver","C:/Users/sasha/Downloads/chromedriver_win32/chromedriver.exe");;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement email= driver.findElement(By.id("email"));
		WebElement pass= driver.findElement(By.id("pass"));
		email.sendKeys("sriswetha1996@gmail.com");
		pass.sendKeys("Swetha@1234");
	
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		System.out.println("You have logged in successfully");
		driver.getTitle();
	}

}
