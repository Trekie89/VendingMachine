import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VendingMachineTDD {

    @Test
    public void saysInsertCoins() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Insert Coins", vendingMachine.displayWelcome());
    }

    @Test
    public void saysThankYou() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Thank You", vendingMachine.displayThankYou());
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

    @Test
    public void customerPushesButtonForCola() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Cola", vendingMachine.button(Buttons.Cola));
    }

    @Test
    public void customerPushesButtonForChips() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Chips", vendingMachine.button(Buttons.Chips));
    }

    @Test
    public void customerPushesButtonForCandy() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Candy", vendingMachine.button(Buttons.Candy));
    }



}
