package com.adactin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\LoginValidation.feature",glue="com.adactin.StepDef")
public class TestRunner {

}
