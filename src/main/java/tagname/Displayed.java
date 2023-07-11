package tagname;//package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed { //class//
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		By u1 = By.name("username");
		By p1 = By.name("password");

		WebElement un = odriver.findElement(u1);
		WebElement pd = odriver.findElement(p1);
		
		//DIsplayed or not//
		
		boolean usernameavailable = un.isDisplayed();  // boolean//
		//if-else//  specific username should taken in webpage --> boolean
		
		if(usernameavailable) {
		 un.sendKeys("Admin");
		 System.out.println("Username Field is present");
		}
		
		else {
			
			System.out.println("No username field is present in the webpage");
		}
		
		   boolean passwordavailable = pd.isDisplayed();
		   
		   if(passwordavailable) {
			   pd.sendKeys("admin123");
			   System.out.println("Password field is displayed");
		   }
		   
		   else {
			   System.out.println("No Password field is displayed");
		   }
		
		   Thread.sleep(4000);
		   odriver.quit();
		                   
	}

}
