package com.avianca.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//public class DatePicker{
//	
//	WebDriver driver;
//}

public class ReservaTuVuelo {

	 WebDriver driver;
	 
	//Se identifican los elementos para realizar la automatización
	 
	 //Región Suramerica
	 By txt_continente = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[5]/div/div[2]/div/div/div[6]/div/div[4]/div[3]/div[8]");
	 
	 //Pais Colombia
	 By txt_pais = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[5]/div/div[2]/div/div/div[6]/div/div[4]/div[3]/div[5]");
	 
	 //Bogota despegar
//	 By txt_origen = By.xpath("/*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[1]/div[1]/div/div/div/input");
	 
	 //Miami despegar    /html/body/div[10]/div/div/ul/li/span
	 // //*[@id="searchbox-sbox-box-flights"]/div/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/input
	 // //*[@id="searchbox-sbox-box-flights"]/div/div/div[3]/div[2]/div[1]/div[1]/div/div/div/input
	 
	 
	 
//	 //Ciudad Cartagena
////	 By txt_origen = By.xpath("//*[@id=\"tab_reservatuvuelo\"]/div/div/div/div/section/div[5]/div/div[2]/div/div/div[6]/div/div[4]/div[3]/div[9]/div[2]");
////	
//	 By txt_origen = By.xpath("/html/body/div[10]/div/div[1]/ul/li[1]/span");
	 
	 ///html/body/div[10]/div/div[1]/ul/li[1]/span
	 
	 //satena Barranquilla

	 By txt_origen = By.xpath("//*[@id=\"origin\"]/option[7]");
	 
	//Bogota satena	 medellin
	By txt_destino = By.xpath("//*[@id=\"destination\"]/option[2]");
	
	// /html/body/form/div/div/div/div[2]/div/div/div/div/div[2]/div[1]/select/option[2]"
	
	// //*[@id="destination"]/option[2]    //*[@id="destination"]/option[2]
	
	// #destination > option:nth-child(2)
	
	//  //*[@id="destination"]/option[2]
	
	//  //*[@id="origin"]/option[19] medellin
	
	// //*[@id="destination"]/option[3] medellin
	 
	 
	//*[@id="pbOrigen_1_1390739206"]
	 //Bogota
//	 By txt_origen = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[1]/div/label/div/input[1]");
	 // /html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[1]/div/label/div/input[1]
	 
//	//B/quilla
//	 By txt_origen = By.id("pbOrigen_1_1390739206");
//	 
//	 //Miami
//	 By txt_destino = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[3]/div[2]/label/div/input[1]");
	 
//	 //Miami  //hacia   id="pbDestino_1_1242814287"
//	 By txt_destino = By.id("pbDestino_1_1242814287");
	 
	 
	 
	 //Fecha viaje origen
//	 By txt_fecorigen = By.xpath("//*[@id=\"ida_regreso_1_599851231\"]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[4]/td[7]/div");
	 
	 By txt_fecorigen = By.id("ui-datepicker-div");
	 
	 // ui-datepicker-div
	 
	 // //*[@id="departure_date"]
	 
	 // //*[@id="departure_date"] fecha  ida 
	
	 // //*[@id="return_date"]  fecha   regreso
	 
	 // //*[@id="destination"]/option[1]   //*[@id="destination"]/option[2]
	 
	 //Fecha destino
	 By txt_fedestino = By.xpath("//*[@id=\"ida_regreso_1_599851231\"]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[5]/td[2]/div");
	 	 

	 
	 //Seleccion clase
	 By txt_tclase = By.xpath("//*[@id=\"ida_regreso_1_599851231\"]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[1]/label[1]");
	
	 //Seleccion pasajero
	 //By txt_adulto = By.xpath("//*[@id=\"ida_regreso_1_599851231\"]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[2]/div[1]/div[1]");
	 
	 By txt_aduto = By.xpath("//*[@id=\"adults\"]/option[2]");
	 
	 
	 // check ida y regreso
	 By check = By.id("opt-solo-ida");
	 
	 //  "opt-ida-regreso"
	 
	 //Click en boton buscar vuelo
	 
	 By btn_submit = By.xpath("//*[@id=\"ida_regreso_1_1242814287\"]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[4]/button");
	 
	 //fechas de viaje  primera id pbFechas_1_1242814287    segunda pbFechas_2_1242814287
	 
	 //primera fecha
	 // //*[@id="ida_regreso_1_599851231"]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[4]/td[7]/div
	 // //*[@id="ida_regreso_1_599851231"]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[4]/td[7]/div
	 
	 // //*[@id="ida_regreso_1_1242814287"]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[4]/td[7]
	 ////*[@id="ida_regreso_1_1242814287"]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[5]/td[2]/div
	 
	 // segunda fecha
	 // //*[@id="ida_regreso_1_599851231"]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[5]/td[2]/div
	 
	
	 //clase economica
	 // //*[@id="ida_regreso_1_599851231"]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[1]/label[1]
	 
	 //adultos
	 // //*[@id="ida_regreso_1_599851231"]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[2]/div[1]/div[1]
	 
	 
	 //buscar vuelo    //*[@id="ida_regreso_1_1242814287"]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[4]/button
	 
	  
	//Crear métodos
	 
	 public void IniciaDriver(WebDriver driver){
			
			this.driver = driver;		
		}
		
		public void FinalizaDriver(WebDriver driver){
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			driver.close();	
			
		}
		
		public void SeleccionarRegion(WebDriver driver) {
			
			//this.driver = driver;	
			driver.findElement(txt_continente).click();
			
		} 
		
		public void SeleccionarPais(WebDriver driver) {
			
			//this.driver = driver;	
			driver.findElement(txt_pais).click();
			
		} 
	 
		public void SeleccionarIda(WebDriver driver) {
			
			//this.driver = driver;	
			driver.findElement(check).click();
			 System.out.println("Seleccionar opción Ida");
		}
	public void SeleccionarOrigen(WebDriver driver) {
		
		//this.driver = driver;	
		driver.findElement(txt_origen).click();
		 System.out.println("Ciudad origen Barranquilla");
	} 
	 
     public void SeleccionarDestino(WebDriver driver) {		
		//this.driver = driver;	
    	 driver.findElement(txt_destino).click();
		System.out.println("Ciudad destino Medellín");
		
	} 
	 
    public void SeleccionarFechaOrigen(WebDriver driver) { 		
 		//this.driver = driver;	
     //driver.findElement(By.xpath("//*[@placeholder='txt_fecorigen']")).sendKeys("29/01/2021");
     driver.findElement(txt_fecorigen).click();         
     //driver.findElement((By.xpath("//*[@id=\"departure_date\"]")).click());
 	List<WebElement>visibleDates = driver.findElements(By.xpath("//*[@id=\"departure_date\"]"));
 	for (WebElement element:visibleDates)
 	{
 		String date = element.getText();
 		if(date.equalsIgnoreCase("29")) {
 			element.click();
 			break;
 			
 		}
 	}
 	    	
 	//driverObject.findElement(By.xpath("\"//*[@id=\\\"departure_date\\\"]\"")).sendKeys("29/01/2021");    
     
 	} 
    
    public void SeleccionarFechaDestino(WebDriver driver) {		
		//this.driver = driver;	
    	// //*[@id="ui-datepicker-div"]   //*[@id="return_date"]
    	driver.findElement(txt_fedestino).click();         
       	List<WebElement>visibleDates = driver.findElements(By.xpath("//*[@id=\"return_date\"]"));
    	for (WebElement element:visibleDates)
    	{
    		String date = element.getText();
    		if(date.equalsIgnoreCase("30")) {
    			element.click();
    			break;
    		}
    		
    	}
		
	} 
    
    public void SeleccionarClase(WebDriver driver) {
		
		this.driver = driver;	
		
	} 
    
    public void SeleccionarPasajero(WebDriver driver) {		
		this.driver = driver;	
		driver.findElement(txt_aduto).click();
		System.out.println("Muestra el número de pasajeros");
	}
    
    public void BuscarVuelo() {		
		
		driver.findElement(btn_submit).click();
		
	} 
    
	 

}
