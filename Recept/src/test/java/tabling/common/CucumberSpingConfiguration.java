package tabling.common;


import tabling.ReceptApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ReceptApplication.class })
public class CucumberSpingConfiguration {
    
}
