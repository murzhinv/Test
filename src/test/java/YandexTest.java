import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    void YandexO() throws InterruptedException {
    open("https://www.yandex.ru");
    Thread.sleep(5000);
 }
}




