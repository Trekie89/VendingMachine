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
    public void saysSoldOut() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Sold Out", vendingMachine.displaySoldOut());
    }

    @Test
    public void customerInsertsACoin() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("0.05", vendingMachine.coins(Coins.Nickle));
        assertEquals("0.10", vendingMachine.coins(Coins.Dime));
        assertEquals("0.25", vendingMachine.coins(Coins.Quarter));
        assertEquals("not valid coin", vendingMachine.coins(Coins.Penny));
    }

    @Test
    public void customerPushesButtonForProduct() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Cola", vendingMachine.button(Buttons.Cola));
        assertEquals("Chips", vendingMachine.button(Buttons.Chips));
        assertEquals("Candy", vendingMachine.button(Buttons.Candy));
    }





}
