package homework.PartOther;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxLen {
    public static void main(String[] args) {
        String regex = "(.)\\1+";
        String text = "aaabb";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }
    }
}
