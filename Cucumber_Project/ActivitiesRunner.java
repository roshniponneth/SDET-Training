package ActivitesRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@hrmactivity1_3",
    strict = true,
    plugin = {"html: target/html_report.html"}
   
)

public class ActivitiesRunner {}
