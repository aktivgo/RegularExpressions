package Task;

import java.util.regex.Pattern;

public class IsPattern {

    static boolean IP(String str){
        String ipPattern = "";
        return Pattern.matches(ipPattern, str);
    }

    static boolean GUID(String str){
        String guidPattern = "";
        return Pattern.matches(guidPattern, str);
    }

    static boolean URL(String str){
        String urlPattern = "";
        return Pattern.matches(urlPattern, str);
    }

    static boolean Password(String str){
        String passwordPattern = "";
        return Pattern.matches(passwordPattern, str);
    }
}