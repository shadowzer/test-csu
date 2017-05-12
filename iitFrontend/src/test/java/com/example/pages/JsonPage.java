package com.example.pages;

import org.openqa.selenium.By;

import java.util.Set;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class JsonPage extends AbstractPage {
    public JsonPage() {
        super();
        this.url = "https://data.mos.ru/apiproxy/opendata/7710878000-reestr-kamer-videonablyudeniya-v-mestah-massovogo-skopleniya-lyudey/meta.json";
    }

    @Override
    public AbstractPage waitPageLoaded() {
        $(By.className("banner-items")).waitUntil(visible, 30000);
        return this;
    }

    public String getJsonText() {
        return $(byXpath("/html/body/pre")).text();
    }

    public void registerNewTab()
    {
        Set<String> test=getWebDriver().getWindowHandles();
        switchTo().window((String) test.toArray()[test.size()-1]);
    }
}
