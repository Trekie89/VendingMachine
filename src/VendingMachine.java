public class VendingMachine {

    public static String display() {
        return "Insert Coins";
    }

    public String coins(Coins value) {

        String coinValue = "";

        if (value.equals(Coins.Nickle))
            coinValue = "0.05";

        return coinValue;
    }

    public static void main(String[] args) {
	// write your code here
    }


}
