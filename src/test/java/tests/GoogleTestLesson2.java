package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("Google_Test_Lesson2")
class GoogleTestLesson2 {
    @Test
    Configuration.holdBrowserOpen= true;

    open('https://www.google.com/');
    $(byNane("text")).setValue("peugeot").pressEnter();




}
