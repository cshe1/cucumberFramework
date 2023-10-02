package com.beacon.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//Features= needs to specify where your tests feature file located
//Glue= where your step definitions are located
//If you want to run just one test, specify which feature file to run in the CucumberOptions.
//To run all tests in the com.beacon.tests folder, leave as is.
//Remember to rebuild project in the IDE so that the latest config will take.

//@CucumberOptions(features="src/main/com.beacon.tests",
//        glue={"com.beacon.steps"})

@CucumberOptions(features="src/main/com.beacon.tests/discord.feature",
        glue={"com.beacon.steps"})

public class TestRunner {
}
