package progecte1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {


    public static void main(String[] args) {


        String stringTest = "[a-zA-Z]";
        String text = "It is interesting TO study VERY";
        Pattern pattern = Pattern.compile(stringTest);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}
