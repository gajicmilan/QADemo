package pages;

import com.microsoft.playwright.Page;

public class ElementsPage {
    private final Page elementsPage;
    private static final String TEXT_BOX_BTN = "//*[text() = 'Text Box']";
    private static final String CHECK_BOX_BTN = "//*[text() = 'Check Box']";
    private static final String RADIO_BUTTON = "//*[text() = 'Radio Button']";
    private static final String WEB_TABLES_BTN = "//*[text() = 'Web Tables']";
    private static final String ELEMENTS_BTN = "//h5[text()='Elements']";

    public ElementsPage(Page page) {
        this.elementsPage = page;
    }

    public void selectTextBox(){
        elementsPage.click(TEXT_BOX_BTN);
    }

    public void selectCheckBox(){
        elementsPage.click(CHECK_BOX_BTN);
    }
    public void selectRadioButton(){
        elementsPage.click(RADIO_BUTTON);
    }
    public void selectWebTables(){
        elementsPage.click(WEB_TABLES_BTN);
    }
    public void clickOnElements() {
        elementsPage.click(ELEMENTS_BTN);
    }
}
