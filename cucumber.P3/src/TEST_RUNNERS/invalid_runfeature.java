package TEST_RUNNERS;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="RESOURSE\\invalid.feature",glue="stepdefination",dryRun=false)
public class invalid_runfeature 
{

}
