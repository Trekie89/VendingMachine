import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachine {

    public static String displayWelcome() { return "Insert Coins"; }

    public static String displayThankYou() {
        return "Thank You";
    }

    public static String displaySoldOut() {
        return "Sold Out";
    }

    public static String displayExactChangeOnly() {
        return "Exact Change Only";
    }

    public static String coins(String coin) {

        String coinValue = "";

        if (coin.equalsIgnoreCase("nickle") ) {
             coinValue = Coins.getNickle();
        }
        else if (coin.equalsIgnoreCase("dime")) {
            coinValue = Coins.getDime();
        }
        else if (coin.equalsIgnoreCase("quarter")){
            coinValue = Coins.getQuarter();
        }
        else if (coin.equalsIgnoreCase("penny")){
            coinValue = Coins.getPenny();
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

    public static Double makeCoinsNumerical(String coinValue) {

        Double totalCoins = 0.0;
        totalCoins = Double.parseDouble(coinValue);
        return totalCoins;
    }

    public static void printProduct(String userChoiceProduct) {
        if (userChoiceProduct.equalsIgnoreCase("cola")) { System.out.println(Product.getCola()); }
        else if (userChoiceProduct.equalsIgnoreCase("chips")) { System.out.println(Product.getChips()); }
        else if (userChoiceProduct.equalsIgnoreCase("candy")) { System.out.println(Product.getCandy()); }
    }

    public static Double addCoins(String userChoiceCoin, Double totalAmount) {
        totalAmount += makeCoinsNumerical(coins(userChoiceCoin));
        return totalAmount;
    }

    public static String getChangeForUser(Double userAmountOwed, Double totalAmount, String changeToUser, DecimalFormat decimalFormat) {
        if (totalAmount > userAmountOwed) {
            changeToUser = decimalFormat.format((totalAmount - userAmountOwed));
        }
        return changeToUser;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userChoiceProduct = "";
        String userChoiceCoin = "";
        Double userAmountOwed = 0.0;
        Double totalAmount = 0.0;
        String changeToUser = "";
        DecimalFormat decimalFormat = new DecimalFormat("0.00");


        System.out.println("What would you like? Cola, Chips, or Candy?");

        userChoiceProduct = scan.nextLine();

        userAmountOwed = Double.parseDouble(product(userChoiceProduct));

        System.out.println("The price is: " + product(userChoiceProduct));

        System.out.println(displayWelcome() + " Nickle, Dime, or Quarter. No Pennies Please.");

        do {
            userChoiceCoin = scan.nextLine();
            totalAmount = addCoins(userChoiceCoin, totalAmount);
            System.out.println(displayWelcome() + " \nTotal so far: " + decimalFormat.format(totalAmount));

        }while (totalAmount < userAmountOwed);

        changeToUser = getChangeForUser(userAmountOwed, totalAmount, changeToUser, decimalFormat);

        printProduct(userChoiceProduct);
        System.out.println();
        System.out.println("Your change: $" + changeToUser);

        System.out.println();
        System.out.println(displayThankYou());

    }
}
