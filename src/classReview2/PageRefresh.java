package classReview2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageRefresh {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //   driver.get("(https://www.facebook.com/");
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//button[text()='Only allow essential cookies']")).click();

        driver.navigate().refresh();
        driver.findElement(By.xpath("//button[text()='Only allow essential cookies']")).click();
    }
}
