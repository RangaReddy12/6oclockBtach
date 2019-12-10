package dec7;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetSize_Method {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/r.php");
driver.manage().window().maximize();
WebElement mobiletextbox=driver.findElement(By.name("reg_email__"));
//get height and width of an element
Dimension dim=mobiletextbox.getSize();
System.out.println("Height::"+dim.getHeight()+"  "+"width::"+dim.getWidth());
//get attribute value of an element
String linkurl=driver.findElement(By.partialLinkText("Data")).getAttribute("href");
System.out.println(linkurl);
driver.close();
	}

}
