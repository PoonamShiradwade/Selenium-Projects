import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers//Chome driver file/chromedriver.exe"); // "Key","Value -chrome driver exe path"
		ChromeDriver driver=new ChromeDriver(); // Created obj of ChromeDriver class, It will open chrome broswer.
		driver.get("https://opensource-demo.orangehrmlive.com/"); // Open url
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		// capturing title of home page
		String act_path= driver.getTitle();
		String exp_path= "OrangeHRM";
		if(act_path.equals(exp_path)
		   {
			   System.out.println("Title is correct");
		   }
			   else
			   {
				   system.out.println("Title is incorrect");
			   }
		   driver.close();// close one browser at time
		   driver.quit();//close all browser at time
		   
		   
		  
		   
			
		

	}

}
