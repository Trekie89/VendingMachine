public class VendingMachine {

    public static String displayWelcome() {
        return "Insert Coins";
    }

    public static String displayThankYou() {
        return "Thank You";
    }

    public String coins(Coins value) {

        String coinValue = "";

        if (value.equals(Coins.Nickle)) {
            coinValue = "0.05";
        }
        else if (value.equals(Coins.Dime)){
            coinValue = "0.10";
        }
        else if (value.equals(Coins.Quarter)){
            coinValue = "0.25";
        }
        else if (value.equals(Coins.Penny)){
            coinValue = "not valid coin";
        }

        return coinValue;
    }

    public static void main(String[] args) {

        displayWelcome();

    }


}
