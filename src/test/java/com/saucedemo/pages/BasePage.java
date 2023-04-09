package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import io.cucumber.java.bs.I;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    public String getPageTitle(String pagename){
        return Driver.get().findElement(By.xpath("//span[text()='"+pagename+"']")).getText();
    }
    public int getBasketQuantitiy(){
        String basketQuantitiyText = Driver.get().findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();
        return Integer.parseInt(basketQuantitiyText);
    }



}
