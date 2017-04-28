import java.util.Scanner;

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


    public String coins(String coin) {

        String coinValue = "";

        if (coin.equalsIgnoreCase("nickle") ) {
             coinValue = Coins2.getNickle();
        }
        else if (coin.equalsIgnoreCase("dime")) {
            coinValue = Coins2.getDime();
        }
        else if (coin.equalsIgnoreCase("quarter")){
            coinValue = Coins2.getQuarter();
        }
        else if (coin.equalsIgnoreCase("penny")){
            coinValue = Coins2.getPenny();
        }

        return coinValue;
    }

    public static String product(String value) {

        String product = "";

        if (value.equalsIgnoreCase("cola")){
            product = "1.00";
        }
        else if (value.equalsIgnoreCase("chips")){
            product = "0.50";
        }
        else if (value.equalsIgnoreCase("candy")){
            product = "0.65";
        }

        return product;
    }

    public Double addCoins(String coinValue) {

        Double totalCoins = 0.0;

        totalCoins += Double.parseDouble(coinValue);

        return totalCoins;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userChoice = "";


//        System.out.println(displayWelcome());

        System.out.println("What would you like? Cola, Chips, or Candy?");

        userChoice = scan.nextLine();

        System.out.println("The price is: " + product(userChoice));

        System.out.println(displayWelcome());







    }
}
