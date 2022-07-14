package org.example.pages;

import org.example.stepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registration {

    public WebElement RgisterBtn(){

        WebElement RgisterBtn = Hocks.driver.findElement(By.className("ico-register"));

        return  RgisterBtn;
    }
}
