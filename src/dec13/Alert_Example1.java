package dec13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert_Example1 {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
//click on login
driver.findElement(By.name("login")).click();	
Thread.sleep(5000);
//get alert text
String alerttext=driver.switchTo().alert().getText();
System.out.println(alerttext);
Thread.sleep(5000);
driver.switchTo().alert().accept();
Thread.sleep(5000);
driver.close();
	}

}
