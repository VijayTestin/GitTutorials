package Practicebasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchingmulitplebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String browser="chrome";
//WebDriver driver;

if("chrome".equalsIgnoreCase(browser)) {
	System.out.println("The Browser is"+browser+"Im");
	System.out.println("TTTTTTT");
	//WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
	driver.get("https://chatgpt.com/");
}
else if("FireFox".equalsIgnoreCase(browser)) {
	WebDriverManager.firefoxdriver().setup();
//	driver=new FirefoxDriver();
}
	}

}
