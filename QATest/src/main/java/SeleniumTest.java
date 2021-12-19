import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

	
	
	public void validateElement() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shadab.sayeed\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		WebElement elem=driver.findElement(By.xpath("xpath"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elem));
		if(driver.findElement(By.xpath("xpath")).isDisplayed())
			System.out.println("The element is present ");
		else
			System.out.println("not present");
	}
	
}
