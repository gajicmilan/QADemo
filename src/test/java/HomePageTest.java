import org.testng.Assert;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class HomePageTest extends PlaywrightRunner {
    @Test
    public void verifyHomePageTitle() {
        page.navigate("https://demoqa.com/");
        String actualTitle = homePage.getHomePageTitle();
        Assert.assertEquals(actualTitle, "DEMOQA");
    }

    @Test
    public void verifyHomePageURl() {
        page.navigate("https://demoqa.com/");
        String actualURL = homePage.getHomePageURL();
        Assert.assertEquals(actualURL, "https://demoqa.com/");
    }

    @Test
    public void verifyNavigateToElements() {
        elementsPage.clickOnElements();
        assertThat(page.locator("//div[@class='main-header']")).isVisible();
    }
}
