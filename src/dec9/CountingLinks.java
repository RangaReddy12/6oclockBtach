package dec9;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountingLinks {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
//driver.navigate().to("http://newtours.demoaut.com/");
driver.get("https://rediff.com");
driver.manage().window().maximize();
//get collection of links ia page which are sotred in html tag a
List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("no of links are::"+links.size());
for(int i=0;i<links.size();i++)
{
//print each link text
	String linktext=links.get(i).getText();
	String linkurl=links.get(i).getAttribute("href");
	System.out.println(linktext+"\n"+linkurl);
}
driver.close();
}
}









