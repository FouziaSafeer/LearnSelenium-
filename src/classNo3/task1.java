package classNo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task1 {
    public static void main(String[] args) {
      // System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);
    }
}
