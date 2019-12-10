package dec7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Orange {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);	
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
driver.findElement(By.cssSelector("#btnLogin")).submit();
Thread.sleep(5000);
if(driver.getCurrentUrl().contains("dash"))
{
	System.out.println("Login Success");
}
else
{
	//get error message
String message=driver.findElement(By.id("spanMessage")).getText();	
	System.out.println(message+"  "+"Login Fail");
}
Thread.sleep(5000);
driver.quit();
	}

}











