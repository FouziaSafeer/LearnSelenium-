package classReview2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClose {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
        // driver.navigate().to("https://www.google.com/");
        //    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Reject all']")).click();
       driver.close();
        /* driver.quit(); */
    }
}
