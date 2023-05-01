package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {
    By dropdown = By.name("products-orderby");
    By addToCart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
}


