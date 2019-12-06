package Dec6.com;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checking_Text {
public static void main(String[] args) throws Throwable {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	String ExtText="gmail";
	//get text
String ActText=driver.findElement(By.partialLinkText("Gm")).getText();
if(ActText.equalsIgnoreCase(ExtText))
{
System.out.println("Link Text is matching::"+ActText+"   "+ExtText);
}
else
{
System.out.println("Link Text is not matching::"+ActText+"   "+ExtText);
}
	Thread.sleep(5000);
	driver.quit();
	}
}
