import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;


public class YandexTest {
    @Test
    void YandexO() throws InterruptedException, IOException {

    open("https://market.yandex.ru/");
    Thread.sleep(5000);
 }
}




