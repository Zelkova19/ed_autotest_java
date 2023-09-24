import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AssertionTest {
    @Test
    void testAssertJunit1() {
        System.out.println("Второй тест");
        Assertions.assertEquals(5, 2 + 3);
    }
}
