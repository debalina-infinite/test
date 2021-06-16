package javavscode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMaven {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in");
        Thread.sleep(3000);
        driver.quit();
    }
    public void sampleMethod()
    {
        System.out.println("This is a sample method.");
    }
}
