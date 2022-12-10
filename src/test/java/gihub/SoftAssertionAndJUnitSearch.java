package gihub;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionAndJUnitSearch {

    @Test
    public void softAssertionsShouldHaveJUnitExample() {
        //Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейти в раздел Wiki проекта
        $("#wiki-tab").click();
        // Проверка: в списке страниц (Pages) есть страница SoftAssertions
        $(byText("Show 2 more pages…")).click();
        $("#wiki-pages-box").$(".Box-row",16).shouldHave(text("SoftAssertions"));
        // Открыть страницу SoftAssertions
        $("#wiki-pages-box").$(".Box-row",16).click();
        // Проверка: внутри есть пример кода JUnit5
        $("#user-content-3-using-junit5-extend-test-class").shouldBe(visible);
    }
}
