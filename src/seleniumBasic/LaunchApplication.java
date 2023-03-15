package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        //1. Open the browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rajah\\IdeaProjects\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
    }
}
