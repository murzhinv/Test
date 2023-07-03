import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class OneTest {
    @Test
    void Open() throws InterruptedException {
    open("https://www.yandex.ru");
    Thread.sleep(5000);
 }
}




