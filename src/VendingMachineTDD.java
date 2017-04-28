import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class VendingMachineTDD {

    @Test
    public void saysInsertCoins() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Insert Coins", vendingMachine.display());
    }

    @Test
    public void customerInsertsNickle() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("0.05", vendingMachine.coins(Coins.Nickle));
    }

    @Test
    public void customerInsertsDime() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("0.10", vendingMachine.coins(Coins.Dime));
    }

    @Test
    public void customerInsertsQuarter() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("0.25", vendingMachine.coins(Coins.Quarter));
    }

    @Test
    public void customerInsertsPenny() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("not valid coin", vendingMachine.coins(Coins.Penny));
    }



}
