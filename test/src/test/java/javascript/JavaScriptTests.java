package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.beans.Transient;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

}
