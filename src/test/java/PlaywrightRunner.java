import com.microsoft.playwright.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.ElementsPage;
import pages.HomePage;

public class PlaywrightRunner {

    protected Page page;
    protected BrowserContext browserContext;
    protected Browser browser;
    protected static Playwright playwright;

    protected HomePage homePage;
    protected ElementsPage elementsPage;

    @BeforeSuite
    public static void init() {
        playwright = Playwright.create();

    }

    @BeforeTest
    public void setUp() {
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        browserContext = browser.newContext();
        page = browserContext.newPage();

        homePage = new HomePage(page);
    }

    @AfterTest
    public void tearDown() {
        browserContext.close();
        browser.close();
    }
}
