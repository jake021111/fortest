import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class PracticeTest {
    @Test
    void testAdd() {
        Practice p = new Practice();
        assertEquals(7, p.add(3, 4));
    }

    @Test
    void testMultiply() {
        Practice p = new Practice();
        assertEquals(12, p.multiply(3, 4));
    }

    @Test
    void testIsEven() {
        Practice p = new Practice();
        assertTrue(p.isEven(4));
        assertFalse(p.isEven(5));
    }
}