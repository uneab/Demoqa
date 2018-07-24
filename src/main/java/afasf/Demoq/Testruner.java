package afasf.Demoq;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\acer\\uneab\\Demoq\\Features\\qa.feature", 
glue = {"org.step"} )


public class Testruner {

}
