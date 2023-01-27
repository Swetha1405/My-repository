
package selenium;

import java.util.concurrent.TimeUnit;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchChrome {
	

public static void main(String[] args) {
	seleniumwaits();
}
		// TODO Auto-generated method stub
public static void seleniumwaits() {
//System.setProperty("wedriver.gecko.driver","C:/Users/sasha/Downloads/chromedriver_win32/chromedriver.exe");

ChromeDriver driver=new ChromeDriver();
driver.get("https://owasp.org/www-project-juice-shop/");
System.out.println(driver.getTitle());
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


//click on store
WebElement store = driver.findElement(By.xpath("/html/body/header/div[3]/nav[2]/div/div/a[1]"));
store.click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//Scenario-1: Click on signin button and login
WebElement signin= driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/header/div/div[2]/div/button[1]"));
signin.click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement email= driver.findElement(By.id("email"));
WebElement pass= driver.findElement(By.id("login_password"));
email.sendKeys("sampletest@gmail.com");
pass.sendKeys("xyz@123");
WebElement checkbox=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]"));
checkbox.click();
WebElement signin1=driver.findElement(By.linkText("Sign in"));
signin1.click();
System.out.println("You have logged in successfully");
driver.getTitle();

// or click on continue with google to login
WebElement cntwithgoogle= driver.findElement(By.xpath("//body/div[@id='main']/div[4]/section[1]/div[2]/div[1]/div[1]/div[2]/button[2]"));
cntwithgoogle.click();


//Scenario -2: Search for product in search bar and add to cart
WebElement search=driver.findElement(By.id("input_0"));
search.sendKeys("mug");
driver.findElement(By.id("Search")).click();
driver.findElement(By.className("SearchResultsGridCellRealview-altRealviewWrapper")).click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("closeIconSvg")).click();
Select quantity=new Select (driver.findElement(By.xpath("//button[@id='Droplist2_button_0']")));
quantity.selectByIndex(2);
driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'View Cart + Check Out')]")).click();
WebElement radiobtn=driver.findElement(By.linkText("Google Pay"));
radiobtn.click();
//making payment
driver.findElement(By.className("\r\n"
		+ "    gpay-card-info-animation-gpay-logo new_style black\r\n"
		+ "    "));
driver.close();

	}

}
