package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {
    public static int count=0;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement dropDownMenu;

@FindBy(xpath = "//a[@class='shopping_cart_link']")
public WebElement yourcartpagelink;
    public void sortItems(String orderType){
        Select select=new Select(dropDownMenu);
        select.selectByVisibleText(orderType);
        select.getFirstSelectedOption().click();

    }
    public void addItem(String itemName){
        Driver.get().findElement(By.xpath("//div[text()='"+itemName+"']/../../..//button")).click();
        count++;
    }
    public void navigateyourcart(){
        yourcartpagelink.click();
    }


}
