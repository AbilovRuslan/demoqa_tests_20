package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    public TextBoxPage() {
        textBoxElements = new TextBoxElements();
    }

    public TextBoxPage openPageTextBox() {
        open("/text-box");
        closeBanner();
        return this;
    }

   // public TextboxPage openPage() {
//        open("/text-box");
//        $(".main-header").shouldHave(text("Text Box"));
//
//        return this;
//    }
//
//    public class TextboxPage removeJsElements() {
//        executeJavaScript("$('#fixedban').remove()");
//        executeJavaScript("$('footer').remove()");
//
//        return this;
//    }
//
//    public TextboxPage setUserName(String value) {
//        userNameInput.setValue(value);
//
//        return this;
//    }
//
//    public TextboxPage setUserEmail(String value) {
//        userEmailInput.setValue(value);
//
//        return this;
//    }
//
//    public TextboxPage setCurrentAddress(String value) {
//        currentAddressInput.setValue(value);
//
//        return this;
//    }
//
//    public TextboxPage setPermanentAddress(String value) {
//        permanentAddressInput.setValue(value);
//
//        return this;
//    }
//
//    public TextboxPage clickSubmitBtn() {
//        submitBtn.click();
//
//        return this;
//    }
//
//    public TextboxPage checkOutputName(String value) {
//        outputName.shouldHave(text(value));
//
//        return this;
//    }
//
//    public TextboxPage checkOutputEmail(String value) {
//        outputEmail.shouldHave(text(value));
//
//        return this;
//    }
//
//    public TextboxPage checkOutputCurrentAddress(String value) {
//        outputCurrentAddress.shouldHave(text(value));
//
//        return this;
//    }
//
//    public TextboxPage checkOutputPermanentAddress(String value) {
//        outputPermanentAddress.shouldHave(text(value));
//
//        return this;
//    }
}