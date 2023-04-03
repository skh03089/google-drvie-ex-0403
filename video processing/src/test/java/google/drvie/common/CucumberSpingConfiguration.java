package google.drvie.common;

import google.drvie.VideoProcessingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoProcessingApplication.class })
public class CucumberSpingConfiguration {}
