package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		
				features = {"Modulos/Home/HomePrueba.feature"},
				glue = "",
				tags = {"@tagSatena"}		
		)
public class CucumberRunner {

}
