package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static utils.RandomGenerator.*;


public class RegistrationFormTest extends TestBase {
        RegistrationPage registrationPage = new RegistrationPage();

        Faker faker = new Faker();


        String firstName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                email = faker.internet().emailAddress(),
                phoneNumber = faker.phoneNumber().subscriberNumber(10),
                address = faker.address().fullAddress(),

        day = String.format("%02d", faker.number().numberBetween(1, 28)),
                month = getRandomMonth(),
                year = String.valueOf(getRandomInt(1900, 2100)),
                gender = getRandomGender(),
                subject = getRandomSubject(),
                hobbies = getRandomHobbies(),
                state = getRandomState(),
                city = getRandomCity(state),
                fileName = "122.png";

        @Test
        void registrationFormTest() {
                registrationPage.openFormRegistration()
                        .closeBanner()
                        .setName(firstName)
                        .setLastName(lastName)
                        .setUserEmail(email)
                        .setGender(gender)
                        .setUserNumber(phoneNumber)
                        .dateOfBirthInput(day, month, year)
                        .subjectsInput(subject)
                        .hobbiesWrapper(hobbies)
                        .uploadPicture(fileName)
                        .setState(state)
                        .setCity(city)
                        .currentAddress(address)
                        .clickSubmit();

                //Проверка формы


                registrationPage
                        .checkResult("Student Name", firstName + " " + lastName)
                        .checkResult("Student Email", email)
                        .checkResult("Gender", gender)
                        .checkResult("Mobile", phoneNumber)
                        .checkResult("Date of Birth", day + " " + month + "," + year)
                        .checkResult("Subjects",subject)
                        .checkResult("Hobbies", hobbies)
                        //.checkResult("uploadPicture",fileName)
                        .checkResult("Picture", fileName)
                        .checkResult("Address", address)
                        .checkResult("State and City", state + " " + city);

        }
}

