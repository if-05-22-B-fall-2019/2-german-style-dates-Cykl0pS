import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String regex = "^(0?[1-9]|[12][0-9]|3[01])[\\.\\s-](0?[1-9]|1[0-2])[\\.\\s-](19|20)?\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(dateString);
    }
}
