import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumCalculatorTest {

    private SumCalculator sumCalculator;
    @BeforeEach
    public void createSumCalculator(){
        sumCalculator = new SumCalculator();
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1, 1",
            "3, 6",
            "5, 15"
    })
    public void testThatSumWorkCorrect(int number, int result) {
        Assertions.assertEquals(result, sumCalculator.sum(number));
    }

    @Test
    public void testThatSumThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}