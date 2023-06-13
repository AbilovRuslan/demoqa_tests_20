package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTests extends TestBase{

    @Test
    void successTest() {


        textBoxPage.openPageTextBox();
        textBoxPage.checkFormHeader();

    }



//            textboxPage.openPage()
//                    .removeJsElements()
//                    .setUserName("Mikhail Rezchikov")
//                    .setUserEmail("test@test.com")
//                    .setCurrentAddress("Some address 1")
//                    .setPermanentAddress("Another address 1")
//                    .clickSubmitBtn();
//
//            textboxPage
//                    .checkOutputName("Mikhail Rezchikov")
//                    .checkOutputEmail("test@test.com")
//                    .checkOutputCurrentAddress("Some address 1")
//                    .checkOutputPermanentAddress("Another address 1");
//        }
//
    }