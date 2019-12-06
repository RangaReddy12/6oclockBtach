package Dec2.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
String str1="Hello";
String str2="hello";
String str3="hello";
String str4="it is soo hot today";
System.out.println(str2.equals(str3));
System.out.println(str1.equals(str2));
System.out.println(str1.equalsIgnoreCase(str2));
System.out.println(str4.contains("soo"));
System.out.println(str4.contains("ay"));
System.out.println(str4.contains("Today"));
	}
}
