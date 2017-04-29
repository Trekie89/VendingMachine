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
    public void saysExactChangeOnly() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Exact Change Only", vendingMachine.displayExactChangeOnly());
    }

    @Test
    public void customerInsertsACoin() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("0.05", vendingMachine.coins("nickle"));
        assertEquals("0.10", vendingMachine.coins("dime"));
        assertEquals("0.25", vendingMachine.coins("quarter"));
        assertEquals("0.01", vendingMachine.coins("penny"));
    }

    @Test
    public void customerPushesButtonForProduct() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("1.00", vendingMachine.product("cola"));
        assertEquals("0.50", vendingMachine.product("chips"));
        assertEquals("0.65", vendingMachine.product("candy"));
    }

//    public void customerPutsInMultipleCoins() {
//        VendingMachine vendingMachine = new VendingMachine();
//        assertEquals(0.50, vendingMachine.addCoins());
//    }

//    @Test
//    public void customerGetsCorrectProduct() {
//        VendingMachine vendingMachine = new VendingMachine();
//        assertEquals("           .=.\n" +
//                "           } {\n" +
//                "          .' '.\n" +
//                "         /     \\\n" +
//                "         ;'---';\n" +
//                "         |PEPSI|\n" +
//                "         | .-. |\n" +
//                "         | '-' |\n" +
//                "         |'---'|\n" +
//                "         '._._.'", vendingMachine.printProduct());
//
//    }

}
