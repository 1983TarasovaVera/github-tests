package gihub;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @Test
   public void dragAndDropActions() {
//        Открыть https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
//        Перенесите прямоугольник А на место В
        //при помощи actions() - НЕ РАБОТАЕТ
//        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(250, 0).release().perform();
//       при помощи  dragAndDropTo
        $("#column-a").dragAndDropTo($("#column-b"));
//        Проверка: прямоугольники действительно поменялись
        $("#column-a").shouldHave(text("B"));
    }
}
