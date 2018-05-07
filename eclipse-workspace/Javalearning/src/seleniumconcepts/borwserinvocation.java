package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class borwserinvocation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/srikanthperla/eclipse-workspace/Javalearning/drivers/chromedriver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.close();
	}

}
