package ReverseString;

import java.util.Locale;

public class StringReverse {
    public static void main(String[] args) {

        String name = "PAVANKUMARREDDY";

        StringBuilder stringBuilder =  new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}
