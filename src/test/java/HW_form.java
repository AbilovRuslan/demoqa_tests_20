
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HW_form {


    @BeforeAll

    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "firefox";

    }
    @Test
    void successTest() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Popov");
        $("#userEmail").setValue("one@two.com");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("9031013947");

        // date of birth
        $("#dateOfBirthInput").click();

        // month
        $(".react-datepicker__month-select").selectOption("December");

        // year
        $(".react-datepicker__year-select").selectOption("1977");

        // date
        $(".react-datepicker__day--027").click();

        //  subject press b + enter
        $("#subjectsInput").setValue("b").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("122.png");
        $("#currentAddress").setValue("Anithing");

        // state
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();

        //выбираем город
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
                $("#submit").pressEnter();

        // Проверка наличия окна с нужными значениями
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Ivan Popov"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("aone@two.com"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Female"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("9031013947"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("27 December,1977"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("Biology"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Music"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text(""));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Anithing"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("NCR Delhi"));
    }
}
