package dec16;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames_Example {
public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		//click on login signup
	driver.findElement(By.xpath("//li[@class='_26Vr']")).click();
	Thread.sleep(5000);
	//get collection of frames
	List<WebElement>frames=driver.findElements(By.tagName("iframe"));
	System.out.println("no of frames are::"+frames.size());
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	//click on login signup
driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Test@gmail.com");
	driver.findElement(By.name("password")).sendKeys("56566756");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button")).click();
	//come out of main frame
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.findElement(By.linkText("X")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Electricity")).click();
	}

}














