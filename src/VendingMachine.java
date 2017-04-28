public class VendingMachine {

    public static String displayWelcome() {
        return "Insert Coins";
    }

    public static String displayThankYou() {
        return "Thank You";
    }

    public static String displaySoldOut() {
        return "Sold Out";
    }

    public static String displayExactChangeOnly() {
        return "Exact Change Only";
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

    public String button(Buttons value) {

        String product = "";

        if (value.equals(Buttons.Cola)){
            product = "Cola";
        }
        else if (value.equals(Buttons.Chips)){
            product = "Chips";
        }
        else if (value.equals(Buttons.Candy)){
            product = "Candy";
        }

        return product;
    }

    public static void main(String[] args) {

        displayWelcome();

    }


}
