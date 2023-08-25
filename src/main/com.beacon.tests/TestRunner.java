package com.beacon.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/com.beacon.tests",
        glue={"com.beacon.steps"})

public class TestRunner {
}
