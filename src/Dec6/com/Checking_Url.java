package Dec6.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checking_Url {
public static void main(String[] args) throws Throwable {
	WebDriver dr=new ChromeDriver();
dr.get("http://gmail.com");
dr.manage().window().maximize();
String strurl="https://";
String currenturl=dr.getCurrentUrl();
if(currenturl.startsWith(strurl))
{
	System.out.println("Url is Secured::"+strurl+"  "+currenturl);
}
else
{
	System.err.println("Url is Not Secured::"+strurl+"  "+currenturl);
}
Thread.sleep(5000);
dr.quit();
	}
}








