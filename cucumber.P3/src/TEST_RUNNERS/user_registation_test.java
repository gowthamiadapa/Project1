package TEST_RUNNERS;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="RESOURSE\\userregistation.feature",glue="stepdefination",dryRun=true)

public class user_registation_test 
{
           
}
