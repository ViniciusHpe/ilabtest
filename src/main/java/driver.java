import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PO;

import java.util.concurrent.TimeUnit;

public class driver extends PO {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinic\\selenium\\chromedriver.exe");

        //Inicia um novo Webdriver
        WebDriver driver = new ChromeDriver();

        //Aguarda 10 segundos para busca do elemento
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Abre o Google e maximiza a tela
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        //Digita na barra de pesquisa do Google
        PO.busca(driver).sendKeys("iLAB Quality");

        //Clica no botão Pesquisa Google
        PO.buscaGoogle(driver).click();

        //Aguarda a página carregar
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        //Armazena o titulo do primeiro resultado da pesquisa
        String result1 = PO.title(driver).getText();

        //Valida se o primeiro resultado contém o nome iLAB no título
        if(result1.contains("iLAB")) {
            System.out.println("O primeiro resultado da pesquisa é do iLAB:");
            System.out.println(result1);
        }else{
            System.out.println("O primeiro resultado da busca não é referente ao iLAB");
        }
        driver.quit();
    }
}
