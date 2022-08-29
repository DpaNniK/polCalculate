import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {

        int result = calculator.calculatePolishNotation("2  4 5 7 + - * ");
        Assertions.assertEquals(-16, result);
    }
}