package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationWithPageObjects extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void registrationFormTest (){
        registrationPage.openFormRegistration();
//                .closeBanner()
//                .setName("Ivan")
//                .setlastName("Popov")
//                .setuserEmail("one@two.com")
//                .setGender("Female")
//                .setuserNumber("9031013947")
//                .dateOfBirthInput("17", "December", "1977")
//                .hobbiesWrapper("Music")
//                .uploadPicture("122.png")
//                .currentAddress("Anything")
//                .setState("NCR");






    }
}
