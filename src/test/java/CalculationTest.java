import org.testng.annotations.*;

import java.util.Scanner;

import static org.testng.Assert.assertEquals;


public class CalculationTest {

    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();

    public static MultiplicationDivisionAndRemainder calculateMultiplicationDivisionAndDivRemainderResult(double x, double y){
        return new MultiplicationDivisionAndRemainder(x*y, x/y, x%y);
    }

    MultiplicationDivisionAndRemainder result = calculateMultiplicationDivisionAndDivRemainderResult(a,b);

    @Test
    public void shouldReturnMultiplication(){
        assertEquals(result.getMultiplication(), a*b);
    }

    @Test
    public void shouldReturnDivision(){
        assertEquals(result.getDivision(), a/b);
    }

    @Test
    public void shouldReturnDivRemainder(){
        assertEquals(result.getDivRemainder(), a%b);
    }

}
