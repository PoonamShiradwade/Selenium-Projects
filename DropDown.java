import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://goo.gl/RVdKM9");
		String Title=driver.getTitle();
		System.out.println("Page Title is:" +Title);
		String url=driver.getCurrentUrl();
		System.out.println("Url is:" +url);
		//System.out.println("Page source is:" +driver.getPageSource());
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Poonam");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Shiradwade");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("7026699866");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
		driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Belagavi");
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("Poonamshiradwade@gmail.com");
		// Selecting dropdown
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
		Select drp=new Select(dropdown);
		//Finding number of options available in dropdown
		System.out.println(drp.getOptions().size());
		//Extracting options
		List <WebElement> options=drp.getOptions();
		for(WebElement o:options)
		{
			System.out.println(o.getText());
		
		}
		//Selecting options
         drp.selectByVisibleText("Morning");// Selecting option ByVisibleText()
         //drp.selectByIndex(2);           // Selecting option ByIndex()
        // drp.selectByValue("Radio-2");  // Selecting option ByValue()
}

		

	}


