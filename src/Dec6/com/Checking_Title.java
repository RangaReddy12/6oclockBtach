package Dec6.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checking_Title {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String Exptitle="google";
		String Acttitle=driver.getTitle();
		//Verify exptitle is equals to acttitle
	if(Exptitle.equalsIgnoreCase(Acttitle))
	{
	System.out.println("Title is Matching::"+Exptitle+"  "+Acttitle);
	}
	else
	{
System.out.println("Title is not Matching::"+Exptitle+"  "+Acttitle);
	}
	//suspend from execution for 4 second 
Thread.sleep(4000);
driver.close();
	}
}






