import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://goo.gl/RVdKM9");
		String Title=driver.getTitle();
		System.out.println("Page Title is:" +Title);
		String url=driver.getCurrentUrl();
		System.out.println("Url is:" +url);
		System.out.println("Page source is:" +driver.getPageSource());
		
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Poonam");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Shiradwade");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("7026699866");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
		driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Belagavi");
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("Poonamshiradwade@gmail.com");
		

	}

}
