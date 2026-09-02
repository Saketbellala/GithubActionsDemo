public class CalculatorTest {
 public static void main (String[] args) {
    if(Calculator.add(2,3) != 5) {
        throw new AssertionError("Test Failed");
    }
    System.out.println("All Tests passed");
 }   
}
