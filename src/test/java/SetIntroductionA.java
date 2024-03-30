import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetIntroductionA {

    public static void main (String[] args)
    {
        System.setProperty("web driver.chrome.driver","/Users/DELL/Documents/chromedriver.exe");
       // ChromeOptions options=new ChromeOptions();
       // options.addArguments("-remote-allow-origins=*");
        ChromeDriver driver=new ChromeDriver();
        //driver.get("https://rahulshettyacademy.com");
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testing");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();



    }
}
