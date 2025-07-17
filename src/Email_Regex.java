import java.util.regex.*;

public class Email_Regex {
    public static void main(String[] args) {
        String email = "example@ex4949^^&&**ample.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }
}
