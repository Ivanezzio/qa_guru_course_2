package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("google_test_l2t2")

public class GoogleTestL2T2 {
    @Test
void selenideSearchTest(){
        Configuration.holdBrowserOpen=true;
    open("https://www.google.com/");
    $(byName("q")).setValue("citroen loadrunner").pressEnter();
    $("html").shouldHave(text("citroen loadrunner"));


    }


}
