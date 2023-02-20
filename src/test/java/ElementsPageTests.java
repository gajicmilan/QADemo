import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementsPageTests extends PlaywrightRunner{
    @BeforeTest
    public void clickElements() {
        elementsPage.clickOnElements();
    }

}
