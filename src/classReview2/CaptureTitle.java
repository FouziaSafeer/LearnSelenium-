package classReview2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
       // driver.navigate().to("https://www.google.com/");
        //    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Reject all']")).click();
        driver.navigate().to("https://www.facebook.com/");
       //driver.get("//div[text()='Reject all']");
       String title=driver.getTitle();
        System.out.println( "The title of the page is : "+title);
        driver.manage().window().maximize();
        driver.close();
    }
}
