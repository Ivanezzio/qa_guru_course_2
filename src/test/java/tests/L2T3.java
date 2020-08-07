package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("l2t3")
public class L2T3 {
    @Test
    void selenideSearchYaTests() {
        Configuration.holdBrowserOpen = true;

        open("https://ya.ru");
        $(byName("text")).setValue("столетие ситроен").pressEnter();
        $("html").shouldHave(text("drive2"));


    }

}
