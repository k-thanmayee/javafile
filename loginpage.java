package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginpage {
    WebDriver driver;
    public loginpage(WebDriver driver){
        this.driver=driver;
    }
    By uname= By.id("username");
    By psswrd=By.id("password");
    By login=By.id("login");
    public void enterusrname(String ursname){
        driver.findElement(uname).sendKeys(ursname);
    }
    public void enterpsswrd(String pswrd){
        driver.findElement(psswrd).sendKeys(pswrd);
    }
    public void loginclick(){
        driver.findElement(login).click();
    }
}
