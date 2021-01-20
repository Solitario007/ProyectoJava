package PasosScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Metodos1 {
	
	WebDriver driver;
	
	@Given("^El usuario ingresa al sitio web de Avianca$")
	public void el_usuario_ingresa_al_sitio_web_de_Avianca() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("El usuario ingresa al sitio web de Avianca");
	}

	@Given("^Selecciona la pestaña “Reserva tu vuelo”$")
	public void selecciona_la_pestaña_Reserva_tu_vuelo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Selecciona la opción Ida y vuelta"); 
	}

	@Given("^Selecciona la opción Ida y vuelta$")
	public void selecciona_la_opción_Ida_y_vuelta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Diligencia la información solicitada");
	}

	@When("^Diligencia la información solicitada$")
	public void diligencia_la_información_solicitada() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		System.out.println("Oprime en el botón “Buscar vuelo");
	}

	@When("^Oprime en el botón “Buscar vuelo”$")
	public void oprime_en_el_botón_Buscar_vuelo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Muestra la información solicitada");
	}

	@Then("^Muestra la información solicitada$")
	public void muestra_la_información_solicitada() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println();
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println();
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println();
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println();
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println();
	}
	
	@Given("^El usuario ingresa al sitio web de Satena$")
	public void el_usuario_ingresa_al_sitio_web_de_Satena() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.satena.com/");
		driver.manage().window().maximize();
	    System.out.println("El usuario ingresa al sitio web de Satena");
	}

	@Given("^Selecciona la opción “Ida”$")
	public void selecciona_la_opción_Ida() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    driver.findElement(By.id("opt-solo-ida")).click();
		System.out.println("Selecciona la opción Ida");
	}

	@When("^Selecciona la Fecha de ida$")
	public void selecciona_la_Fecha_de_ida() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Selecciona la Fecha de ida");
	}

	@Then("^Muestra la información$")
	public void muestra_la_información() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Muestra la información");
	}




}
