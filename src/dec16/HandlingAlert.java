package dec16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HandlingAlert {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/promp.html");
	driver.findElement(By.xpath("/html/body/fieldset/button")).click();	
	Thread.sleep(4000);
	String alerttext=driver.switchTo().alert().getText();
	System.out.println(alerttext);
	Thread.sleep(4000);
	driver.switchTo().alert().sendKeys("Akhilesh");
	Thread.sleep(4000);
	driver.switchTo().alert().accept();
	Thread.sleep(4000);
	String message=driver.findElement(By.id("promptdemo")).getText();
	System.out.println(message);
	Thread.sleep(4000);
	driver.quit();
	}
}














