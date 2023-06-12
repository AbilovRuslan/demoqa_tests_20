package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {


    public RegistrationPage openFormRegistration() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage closeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setName(String name) {
        $("#firstName").setValue(name);
        return this;
    }

    public RegistrationPage setlastName(String lastName) {
        $("#lastName").setValue(lastName);
        return this;
    }

    public RegistrationPage setuserEmail(String userEmail) {
        $("#userEmail").setValue(userEmail);
        return this;
    }

    public RegistrationPage setuserNumber(String userNumber) {
        $("#userNumber").setValue(userNumber);
        return this;
    }

    public RegistrationPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage dateOfBirthInput(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        return this;
    }

    public RegistrationPage hobbiesWrapper(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage currentAddress(String value) {
        $("#currentAddress").setValue(value).click();
        return this;
    }

     public RegistrationPage setState(String value) {
        $("#selectState").setValue(value).pressEnter();
       return this;
    }
}