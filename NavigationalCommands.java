import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://goo.gl/RVdKM9");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Software Testing Tutorials")).click();
		
		String Title1=driver.getTitle();
		System.out.println("Title1:"+Title1);
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Software Testing Tools")).click();
		String Title2=driver.getTitle();
		System.out.println("Title2:"+Title2);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		

	}

}
