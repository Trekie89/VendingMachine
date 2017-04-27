import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VendingMachineTDD {

    @Test

    public void saysInsertCoins() {

        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Insert Coins", vendingMachine.display());

    }

}
