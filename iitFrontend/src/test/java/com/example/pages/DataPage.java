package com.example.pages;

import com.codeborne.selenide.SelenideElement;
import com.example.components.CategoryItemDataPage;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DataPage extends AbstractPage {
    public DataPage() {
        super();
        this.url = "https://data.mos.ru/opendata";
    }

    public AbstractPage navigate() {
        return super.navigate(this.getClass());
    }

    @Override
    public AbstractPage waitPageLoaded() {
        $(".loader-block").waitWhile(visible, 30000);
        return this;
    }

    public CategoryItemDataPage getSelectedItem() {
        CategoryItemDataPage category = new CategoryItemDataPage();
        category.setSelf($(".items-list .selected"));
        return category;
    }

    public SelenideElement getPassportButton(String subCategory) {
        return $(byText(subCategory)).parent().parent().find(byId("dropPassportLink"));
    }

    public SelenideElement getJsonOption() {
        return $(byCssSelector("#dropPass > li:nth-child(1) > a"));
    }

    public SelenideElement getExportButton(String sub) {
        return $(byText(sub)).parent().parent().find(byId("dropDepartmentsLink"));
    }

    public SelenideElement getXlsxOption() {
        return $(byCssSelector("#dropExport > li:nth-child(3) > div > a > div"));
    }

    public boolean isFileDownloaded(String downloadPath, String fileName) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }
}
