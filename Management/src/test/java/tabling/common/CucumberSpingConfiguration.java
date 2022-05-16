package tabling.common;


import tabling.ManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ManagementApplication.class })
public class CucumberSpingConfiguration {
    
}
