import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://goo.gl/RVdKM9");
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
		System.out.println(radio.isEnabled());
		System.out.println(radio.isDisplayed());
		//System.out.println(radio.isSelected());// false- before selecting radio button
		radio.click();
		Thread.sleep(3000);
		System.out.println(radio.isSelected());// true- after selecting radio button
		

	}

}
