package com.example.pages;

import com.codeborne.selenide.SelenideElement;
import com.example.components.Categories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends AbstractPage {
    public MainPage() {
        super();
        this.url = "https://data.mos.ru/";
    }

    public AbstractPage navigate() {
        return super.navigate(this.getClass());
    }

    @Override
    public AbstractPage waitPageLoaded() {
        $(By.className("banner-items")).waitUntil(visible, 30000);
        return this;
    }

    public Categories getCategories() {
        Categories categories = new Categories();
        categories.setSelf($("#categories"));
        return categories;
    }

    public SelenideElement getLanguageSwitcher() {
        return $(byCssSelector("#generalMenu > ul.culture-list > li.inactivevisible > a"));
    }

    public SelenideElement getDataLink() {
        return $(byCssSelector("#generalMenu > ul.section-list > li:nth-child(1) > a"));
    }
}
