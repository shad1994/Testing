import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.xjc.Driver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path ="C:\\Users\\shadab.sayeed\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> itr=driver.getWindowHandles();
		List<String> list = new ArrayList<String>(itr);
		WebDriver driver2=driver.switchTo().window(list.get(0));
		driver.close();
		
		//driver.switchTo().defaultContent();
		driver2.get("http://www.facebook.com");
	}

}
