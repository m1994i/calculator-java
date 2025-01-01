import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatorTest {

    @Test
    public void testCalculate() {
        Calculator calculator = new Calculator();

        // Test osnovne operacije
        assertEquals(9, calculator.calculate("4+5"));
        assertEquals(27, calculator.calculate("10+5*4+3"));
        assertEquals(-2, calculator.calculate("-5+3"));
    }
}
