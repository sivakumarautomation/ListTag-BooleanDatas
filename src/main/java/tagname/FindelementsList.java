package tagname; //package//

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsList { //class//
	
	public static void main(String[] args) throws InterruptedException { //Main//
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.navigate().to("https://www.flipkart.com/");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();

		List<WebElement> imageall = odriver.findElements(By.tagName("img"));

		System.out.println(imageall.size());

		for (WebElement imagelist : imageall) {

			String listed = imagelist.getText();
			System.out.println(listed);

			/*Thread.sleep(6000);

			odriver.quit();*/
		}

	}

}
