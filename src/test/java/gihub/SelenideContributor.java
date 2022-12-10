package gihub;

import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideContributor {

    @Test
    public void andreiSolntsevShouldBeTheFirstContributor(){
        //открыть страничку selenide
        open("https://github.com/selenide/selenide");
        //подвести мышку к первому элементу в области Contributors
        $(".BorderGrid").$(byText("Contributors"))
                .closest("div").$("ul li").hover();
        //проверка: в появившемся окошке (overly) текст Andrei Solntsev
        $$(".Popover-message").findBy(visible).should(text("Andrei Solntsev"));
    }
}
