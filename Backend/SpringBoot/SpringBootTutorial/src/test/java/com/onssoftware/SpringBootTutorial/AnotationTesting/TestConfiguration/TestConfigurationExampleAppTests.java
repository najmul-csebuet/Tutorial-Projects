package com.onssoftware.SpringBootTutorial.AnotationTesting.TestConfiguration;

import com.onssoftware.SpringBootTutorial.AnnotationTesting.TestConfiguration.DataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@Import(value = {WebClientTestConfiguration.class})
//@ContextConfiguration(classes = WebClientTestConfiguration.class)
//@TestPropertySource(locations = "classpath:test.properties")
public class TestConfigurationExampleAppTests {

    @Autowired
    private DataService dataService;

    @Test
    @DynamicPropertySource()
    void contextLoads() {
    }
}
