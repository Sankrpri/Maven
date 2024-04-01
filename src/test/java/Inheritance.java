import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class Inheritance {

    int speedLimit=90;

    }
    class Honda extends Inheritance
    {
        int speedLimit=150;
        public static void main (String[] args) throws InterruptedException {

            Inheritance obj= new Honda();
            System.out.println(obj.speedLimit);
            Honda obj1= new Honda();
            System.out.println(obj1.speedLimit);


        }


        }


