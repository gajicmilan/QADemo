package pages;

import com.microsoft.playwright.Page;

public class HomePage {
    private final Page homePage;
    public HomePage(Page page) {
        this.homePage = page;
    }

    public String getHomePageTitle() {
        return homePage.title();
    }

    public String getHomePageURL() {
        return homePage.url();
    }
}
