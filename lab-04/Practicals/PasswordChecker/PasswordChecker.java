//import java.util.*;

public class PasswordChecker {
    public static boolean hasdigit(String p) {
        return p.length() >= 8;
    }

    public static boolean hasupper(String p) {
        return p.matches(".*[A-Z].*");
    }

    public static boolean hasdigits(String p) {
        return p.matches(".*[0-9].*");
    }

    public static boolean hassc(String p) {
        return p.matches(".*[\\W_].*");
    }

    public static void strong(String p) {
        int cnt = 0;
        if (hasdigit(p)) {
            cnt++;
        }
        if (hasupper(p)) {
            cnt++;
        }
        if (hasdigits(p)) {
            cnt++;
        }
        if (hassc(p)) {
            cnt++;
        }

        if (cnt == 4) {
            System.out.println("Strong Password");
        } else if (cnt <= 3 && cnt >= 2) {
            System.out.println("Mid Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
