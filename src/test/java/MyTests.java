import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

@Epic("Epic. Allure examples")
@Feature("Feature. Junit 5 support")
public class MyTests {

    @Test
    @Story("Story. Base support for bdd annotations")
    @Description("Some detailed test description")
    public void testSomething() {
        System.out.println("asd");
        assert true;
    }
}
