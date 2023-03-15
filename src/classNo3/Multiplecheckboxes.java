package classNo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Multiplecheckboxes {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String url = "https://itera-qa.azurewebsites.net/home/automation";
        driver.get(url);

        //selecting all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'  and@type='checkbox']"));

         for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i);
           // checkboxes.iterator(driver.findElement(By.xpath("//input[@id= 'tuesday']")))
        }


      /*  for (WebElement l : checkboxes) {
            l.click();
            //input[@type='checkboc'and contains(@id,'day')] for day contains
*/
        //input[@id='tuesday']

        //for (int i = 0; i < checkboxes.size(); i++) {
       //  WebElement  webElement = checkboxes.contains("//input[@id= 'tuesday']");




        }
        }

