package classNo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class selectedCheckboxesLastTwo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String url = "https://itera-qa.azurewebsites.net/home/automation";
        driver.get(url);

        //selecting all checkboxes
       //List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'  and@type='checkbox']"));
    List<WebElement>Sectedboxes=driver.findElements(By.xpath("//input[@type = 'checkbox' and contains(@id, 'day')] "));
        for (int i = 5; i < Sectedboxes.size(); i++) {
            Sectedboxes.get(i).click();

        }




       /* for(int i=0; i<Sectedboxes.size();i++) {
            if(Sectedboxes. .getAttribute("id").equalsIgnoreCase("tuesday")||(days.getAttribute("id").equalsIgnoreCase("thursday"))||(days.getAttribute("id").equalsIgnoreCase("saturday"))){
                days.click();
            }*/




      /*  for (int i = 0; i < Sectedboxes.size(); i++) {
            driver.findElement(By.id("monday")).click();
            driver.findElement(By.id("wednesday")).click();
            driver.findElement(By.id("friday")).click();

        }*/




    }
}
