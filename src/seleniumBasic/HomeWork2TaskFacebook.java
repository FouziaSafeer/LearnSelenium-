package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeWork2TaskFacebook {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.google.com/");
    //    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Reject all']")).click();
//driver.findElement(By.tagName("//button[2]")).click();
//        driver.get("https://google.com/");
        // driver.findElement(By.xpath(//button[text()='Reject all'])))
        // String url = "https://www.facebook.com/";

     /* //  driver.get(url);
        if(driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).isDisplayed()){
            driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
        }
        driver.manage().window().maximize();
        //driver.findElement(By."button"
       // driver.findElement(By.linkText("Create new account")).click();
       // driver.findElement(By.linkText("Create new account")).click();
    }
}
}
      */
    }}