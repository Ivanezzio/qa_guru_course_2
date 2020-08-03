package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("yandex_tests")
class YandexTests {
    @Test
    void selenideSearchYandexTest() {

        Configuration.holdBrowserOpen =true;

        // Открыть google
        open("https://ya.ru");

        // Ввести Selenide в поиск
        $(byName("text")).setValue("аквафор").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("Фирменный магазин АКВАФОР"));
    }
}
