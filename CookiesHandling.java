package MainPackage.SeleniumChromeDriver.locators.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.amazon.in/");
        System.out.println("--------------------------------Get All Cookies----------------------------");
        Set<Cookie> cookies1=wd.manage().getCookies();
        for (Object o : cookies1)
        System.out.println(o);

        System.out.println("--------------------------------Add Cookies----------------------------");
       Cookie c1 = new Cookie("name","Shelar");
         wd.manage().addCookie(c1);

        Set<Cookie> cookies=wd.manage().getCookies();
        for (Cookie o : cookies)
            System.out.println(o);

        System.out.println("--------------------------------Fetch Single named Cookies----------------------------");
        System.out.println(wd.manage().getCookieNamed("name"));

        System.out.println("--------------------------------Delete Single Named Cookies----------------------------");
        wd.manage().deleteCookieNamed("name");


        Set<Cookie> cookies2 =wd.manage().getCookies();
        for (Object o : cookies2)
            System.out.println(o);

        wd.close();
    }
}
