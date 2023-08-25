package com.beacon.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//Features= needs to specify where your tests feature file located
//Glue= where your step definitions are located
@CucumberOptions(features="src/main/com.beacon.tests",
        glue={"com.beacon.steps"})

public class TestRunner {
}
