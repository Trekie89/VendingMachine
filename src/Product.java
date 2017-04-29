/**
 * Created by Samantha on 4/29/2017.
 */
public class Product {

    private static final String cola =
            "           .=.\n" +
            "           } {\n" +
            "          .' '.\n" +
            "         /     \\\n" +
            "         ;'---';\n" +
            "         |PEPSI|\n" +
            "         | .-. |\n" +
            "         | '-' |\n" +
            "         |'---'|\n" +
            "         '._._.'";

    private static final String candy =
            "           ___      .' /:::.      ___\n" +
            "          \\  \"-.  /  (:::-'\\  .-\"  /\n" +
            "           >_-=.\\/:\\__\\/__  \\/.=-_<\n" +
            "           > -='/\\::::/\\:::\\/\\'=- <\n" +
            "          /__.-'  \\::'  )::/  '-.__\\\n" +
            "                   '.__/::'";

    private static final String chips =
            "            ,-.     \n" +
            "            :_.'\n" +
            "       *pop*,--.\n" +
            "            |--|\n" +
            "            |  |\n" +
            "            |  |\n" +
            "            |  |  __\n" +
            "            `--' (_(\n" +
            "          Pringles";


    public Product() {
    }

    public static String getCola() {
        return cola;
    }

    public static String getCandy() {
        return candy;
    }

    public static String getChips() {
        return chips;
    }
}
