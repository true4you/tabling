package tabling.common;


import tabling.SeatApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SeatApplication.class })
public class CucumberSpingConfiguration {
    
}
