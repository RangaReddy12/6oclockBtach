package dec12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox1_Example {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
//verify checkbox is active or not
WebElement checkbox	=driver.findElement(By.name("remember"));
boolean value=checkbox.isSelected();
System.out.println(value);
if(!checkbox.isSelected())
{
	//un check from seletion
	checkbox.click();
}
else
{
	//select checkbox
	checkbox.click();
}
	}

}
