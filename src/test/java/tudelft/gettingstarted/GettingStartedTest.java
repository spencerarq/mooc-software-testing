package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(23,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0); // entrada 0
        Assertions.assertEquals(5, result); // saída 5
    }
//
    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20); // entrada -20
        Assertions.assertEquals(-15,result); // saida -15
    }
}
