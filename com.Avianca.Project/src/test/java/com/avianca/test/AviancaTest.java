package com.avianca.test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AviancaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ReservaTuVuelo pavianca = new ReservaTuVuelo();
		//DatePicker calavianca = new Datepicker();
		
		//WebDriver driverObject = new ChromeDriver();
//		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		
		//driver.get("https://www.avianca.com/co/es/");
		
		driver.get("https://www.satena.com/");
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		
		//Se llaman los m�todos
		pavianca.IniciaDriver(driver);
//      pavianca.SeleccionarRegion(driver);
//		pavianca.SeleccionarPais(driver);
		pavianca.SeleccionarOrigen(driver);
		
		pavianca.SeleccionarIda(driver);
		
//		pavianca.SeleccionarDestino(driver);
//		pavianca.SeleccionarFechaOrigen(driver);
//		pavianca.SeleccionarFechaDestino(driver);
//		pavianca.SeleccionarClase(driver);
		pavianca.SeleccionarPasajero(driver);
//		pavianca.BuscarVuelo();
//		pavianca.FinalizaDriver(driver);

//		driver.switchTo().defaultContent();
//      driver.switchTo().frame("external-page");  //*/		
			
//        Thread.sleep(5000);
//		
//		  driver.close();

	}

}
