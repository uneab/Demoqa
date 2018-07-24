package afasf.Demoq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
 public static WebDriver driver;
 
 public static void browseropen() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\uneab\\Demoq\\Div\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
}
 
 public static void browserclose() {
driver.quit();
}
 
 public static void launchApp(String url) {
	 driver.get(url);
}
 
 public static void typeText(WebElement ele, String txt) {
ele.sendKeys(txt);
}
 
}
