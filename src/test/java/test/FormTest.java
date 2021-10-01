import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    public void firstTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Victor");
        $("#lastName").setValue("Rybakov");
        $("#userEmail").setValue("7152955@gmail.com");
        $("label[for='gender-radio-1']").click();
        $("#userNumber").setValue("1234567890");



    }
}