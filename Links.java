import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
		driver.close();
		

	}

}
