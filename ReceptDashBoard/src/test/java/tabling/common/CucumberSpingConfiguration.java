package tabling.common;


import tabling.ReceptDashBoardApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ReceptDashBoardApplication.class })
public class CucumberSpingConfiguration {
    
}
