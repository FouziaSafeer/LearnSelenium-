package classReview2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureUrl {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String PageUrl =driver.getCurrentUrl();
        System.out.println("Page Url : "+ PageUrl);
        driver.findElement(By.xpath("//button[text()='Only allow essential cookies']")).click();
        driver.manage().window().maximize();

    }
        }
