package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO {
    private static WebElement element = null;

    //Campo de busca do Google
    public static WebElement busca(WebDriver driver) {
        element = driver.findElement(By.name("q"));
        return element;
    }

    //Botão 'Pesquisa Google'
    public static WebElement buscaGoogle(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@name='btnK']"));
        return element;
    }

    //Titulo do primeiro retorno da pesquisa
    public static WebElement title(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@data-hveid='CAEQAQ']/div/a/h3/span"));
        return element;
    }

}
