package org.example.stepDefs;
import io.cucumber.java.en.Given;
import org.example.pages.registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D01_registerStepDef {

    registration reg = new registration();

    @Given("user go to register page")

    public void step1(){

      reg.RgisterBtn().click();

    }

}
