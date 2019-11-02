package validator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(JUnitParamsRunner.class)
public class PasswordValidatorTest {

    private final Object[] getInputWithoutMatch() {
        return new Object[] {
            "abc 12",
            "adamala",
            "testowe 13"
        };
    }

    private final Object[][] getInputWithMatch() {
        return new Object[][] {
                {"abc 123", new int[]{123}},
                {"adamala 123 321", new int[] {123,321} },
                {"testowe 13,322,1, abc 233", new int[] {322, 233} }
        };
    }

    @Test
    @Parameters(method = "getInputWithoutMatch")
    public void shouldReturnEmptyList(String input) {
        final String inputParam = input;

        Assert.assertEquals(new ArrayList<Integer>(), PasswordValidator.validate(input));
    }

    @Test
    @Parameters(method = "getInputWithMatch")
    public void shouldReturnMatches(String input, int[] expected) {
        final String inputParam = input;
        ArrayList<Integer> exp = new ArrayList<>();
        for(int i : expected) exp.add(i);

        Assert.assertEquals(exp, PasswordValidator.validate(input));
    }

    @Test
    public void shouldReturnEmptyListOnNullInput() {
        String nullStr = null;

        Assert.assertEquals(new ArrayList<>(), PasswordValidator.validate( nullStr));
    }
}
