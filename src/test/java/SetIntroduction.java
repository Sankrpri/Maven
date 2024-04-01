import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;
import java.util.List;

public class SetIntroduction {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver","/Users/DELL/Documents/chromedriver.exe");
       // ChromeOptions options=new ChromeOptions();
       // options.addArguments("-remote-allow-origins=*");

        String ta="ABCC";
        String abc=ta.replace("C" , "D");
        System.out.println(ta);
        System.out.println(abc);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

       driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div/button[2]/span")).click();
       // Thread.sleep(5000);
       // driver.findElement(By.xpath("//div[text()='My Profile']")).click();
        //System.out.println(x);
        /* WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(5000);

        //find total link

        List<WebElement> totalLinkElement= driver.findElements(By.xpath("//ul[@class='oxd-pagination__ul']/li"));
        Thread.sleep(5000);
        int totalLinks= totalLinkElement.size();
        System.out.println(totalLinks);

        for(int i=0;i<totalLinks;i++)
        {

            try {
                String currentText=totalLinkElement.get(i).getText();


                int page=Integer.parseInt(currentText);
                System.out.println("Page:" + page);
                totalLinkElement.get(i).click();
                Thread.sleep(3000);
                List<WebElement> emp_list= driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div[4]"));
                Thread.sleep(3000);
                for(int j=0; i<emp_list.size();j++)
                {
                    //prnt last name of each row

                    String lastname=emp_list.get(j).getText();

                    System.out.println("Last Name :" +lastname);

                }


            }catch (Exception e)
            {
                System.out.println("Not a Number");
                System.out.println(e.getStackTrace());
            }
        }


        System.out.println(driver.getTitle());
        System.out.println("Mausam");
        //System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();*/



    }
}
