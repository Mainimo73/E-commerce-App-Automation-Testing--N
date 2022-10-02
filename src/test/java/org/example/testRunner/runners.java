package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
        (
                features = "src/main/resources/features" ,
                 glue = "org.example.stepDefs"  ,
                 plugin = {  "pretty"  ,
                        "html:target/cucumber.html"  ,
                       "html:target/cucumber.json" ,
                      "html:target/cukes.xml"  ,
                    "return:target/return.txt"  } ,
                tags = "@smoke"

        )
public class runners extends AbstractTestNGCucumberTests {


}
