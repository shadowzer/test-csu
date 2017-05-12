package com.example.tests;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.testng.annotations.Report;
import com.example.BaseTest;
import com.example.components.Categories;
import com.example.pages.DataPage;
import com.example.pages.JsonPage;
import com.example.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

@Test
@Report
public class MainPageTest extends BaseTest {
    private static final String CATEGORY_NAME = "Безопасность";

    @Test
    public void setEnglishVersion() {
        MainPage page = page(MainPage.class);

        page.navigate();
        SelenideElement languageSwitcher = page.getLanguageSwitcher();
        languageSwitcher.click();
        page.waitPageLoaded();
        Assert.assertEquals(page.getDataLink().getText(), "DATA");
    }

    @Test
    public void openSecurityCategory() {
        MainPage page = page(MainPage.class);

        page.navigate();
        Categories categories = page.getCategories();
        categories.getCategoryByName(CATEGORY_NAME).getUnit().click();

        DataPage dataPage = page(DataPage.class);
        dataPage.shouldBeOpened();
        dataPage.getSelectedItem().getTextElement().shouldHave(text(CATEGORY_NAME));
    }

    @Test
    public void checkSecurityCamerasRegisterInCrowdedPlacesPassport() {
        final String subCategory = "Реестр камер видеонаблюдения в местах массового скопления людей";
        MainPage page = page(MainPage.class);

        page.navigate();
        Categories categories = page.getCategories();
        categories.getCategoryByName(CATEGORY_NAME).getUnit().click();

        DataPage dataPage = page(DataPage.class);
        dataPage.shouldBeOpened();
        dataPage.getPassportButton(subCategory).click();
        dataPage.getJsonOption().click();

        JsonPage jsonPage = page(JsonPage.class);
        jsonPage.registerNewTab();

        Assert.assertEquals(jsonPage.getJsonText().contains("\"Title\":\"" + subCategory + "\""), true);
    }

    @Test
    public void downloadXlsx() {
        final String subCategory = "Реестр камер видеонаблюдения в местах массового скопления людей";
        final String downloadDirectoryPath = "C:\\Users\\cod_s\\Downloads"; // FIXME: change this path to yours
        final String fileName = "data-8174-2016-12-15.zip"; // FIXME: check if filename is still legit

        MainPage page = page(MainPage.class);

        page.navigate();
        Categories categories = page.getCategories();
        categories.getCategoryByName(CATEGORY_NAME).getUnit().click();

        DataPage dataPage = page(DataPage.class);
        dataPage.shouldBeOpened();
        dataPage.getExportButton(subCategory).click();
        dataPage.getXlsxOption().click();
        sleep(1000);

        Assert.assertEquals(dataPage.isFileDownloaded(downloadDirectoryPath, fileName), true);
    }
}
