package TEST_RUNNERS;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="RESOURSE\\multidata.feature",glue="stepdefination",dryRun=true)

public class multidata_test 
{
     
}

