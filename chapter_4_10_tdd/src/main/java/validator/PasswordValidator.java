package validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static List<Integer> validate(String in) {
        if( in == null ) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\d{3}").matcher(in);
        while (matcher.find()) {
            result.add(Integer.valueOf(matcher.group()));
        }

        return result;
    }
}
