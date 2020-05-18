import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

class SeleNNium {
    @Test
    public void UserCanLog() {  //C:\Program Files\Java\webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");// путь к хромдрайверу
        ChromeDriver driver;
        driver = new ChromeDriver();driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);// таймер ожидани
        driver.get("https://itvdn.com/ru");
        driver.manage().window().maximize();
        WebElement element;
        WebElement element1 = driver.findElement(By.xpath("//div[@class='search-cabinet-block']//div[@class='cabinet-controls-wrap']//a[@class='cabinet-btn']//div//span[@class='cabinet-btn-title']"));
        element1.click();
        WebElement element2 = driver.findElement(By.xpath("//div[@class='registration-wrap']//a[@class='btn-filled-orange']"));
        element2.click();
        WebElement element3 = driver.findElement(By.xpath("//input[@placeholder='Введите Ваше имя']"));
        element3.sendKeys("Nick");
        WebElement element4 = driver.findElement(By.xpath("//input[@placeholder='Введите Вашу фамилию']"));
        element4.sendKeys("Petrych");
        WebElement element5 = driver.findElement(By.xpath("//input[@id='Email']"));
        element5.sendKeys("nick.petrych@gmail.com");
        WebElement element6 = driver.findElement(By.xpath("//input[@id='Phone']"));
        element6.sendKeys("0954572332");
        WebElement element7 = driver.findElement(By.xpath("//input[@id='Password']"));
        element7.sendKeys("admin1");
        WebElement element8 = driver.findElement(By.xpath("//input[@id='PasswordConfirm']"));
        element8.sendKeys("admin1");
        WebElement element9 = driver.findElement(By.xpath("//div[@class='g-recaptcha']"));
        element9.click();
        WebElement element10 = driver.findElement(By.xpath("//input[@class='btn-orange-border-black-font']"));
        element10.click();
        driver.quit();
    }
}