package atm;

import org.junit.Test;

public class ATMTest {

    @Test(expected = IllegalArgumentException.class)
    public void testWrong(){
        ATM atm = new ATM();
        atm.process(1);
    }

    @Test
    public void testCorrect() {
        ATM atm = new ATM();
        atm.process(20);
    }
}