package com.dec5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_getCommands {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://snapdeal.com");
	driver.manage().window().maximize();
//print title of the page and lenght of the title
String  strtitle=driver.getTitle();
System.out.println("page title::"+strtitle);
System.out.println("page title lenght::"+strtitle.length());
//print url of the page and lenght of the url
String strurl=driver.getCurrentUrl();
System.out.println("url of page::"+strurl);
System.out.println("url length::"+strurl.length());
driver.close();
	}

}
