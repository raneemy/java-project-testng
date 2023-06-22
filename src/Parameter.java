import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;

public class Parameter {
	
WebDriver driver =new FirefoxDriver();


@BeforeTest
public void setup() {
	driver.get("https://magento.softwaretestingboard.com/");
}

@AfterTest
public void end() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.quit();
}


}
