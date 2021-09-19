package Examples;

import java.util.regex.*;

public class ExampleGFG_2 {
    public static void main(String[] args) {
        // Get the regex to be checked
        String regex = "\\b(?<GFG>[A-Za-z\\s]+)";

        // Create a pattern from regex
        Pattern pattern
                = Pattern.compile(regex);

        // Get the String to be matched
        String stringToBeMatched = "   GFGFGFGFGFGFGFGFGFG";

        // Create a matcher for the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);

        // Get the current matcher state
        MatchResult result = matcher.toMatchResult();
        System.out.println("Current Matcher: " + result);

        while (matcher.find()) {
            // Get the first index of match result
            System.out.println(matcher.start("GFG"));
        }
    }
}