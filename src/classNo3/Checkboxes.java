package classNo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        String url="https://itera-qa.azurewebsites.net/home/automation";
        driver.get(url);
        WebElement checkbox= driver.findElement(By.xpath("//input[@id='monday']"));
        checkbox.click();
       /* List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'  and@type='checkbox']"));
        for (WebElement l:checkboxes)
              { l.click();
                  //input[@type='checkboc'and contains(@id,'day')] for day contains
*/
        }

    }

