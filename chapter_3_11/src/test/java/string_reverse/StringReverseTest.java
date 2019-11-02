package string_reverse;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;

@RunWith(JUnitParamsRunner.class)
public class StringReverseTest {

    public static final Object[] getValidInputs() {
        return new Object[][] {
                {"ala ma kota", "atok am ala"},
                {"kot ma ale", "ela am tok"},
                {"test","tset"}
        };
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionIfNullInput  () {
        String nullStr = null;

        StringReverse.reverse(nullStr);
    }

    @Test
    @Parameters(method = "getValidInputs")
    public void shouldReturnReversedStringIfValidInput(String input, String expected) {
        String reversed = StringReverse.reverse(input);

        Assert.assertEquals(reversed, expected);
    }

    @Test
    public void shouldReturnEmptyStringIfEmptyInput() {
        String emptyInput = "";

        Assert.assertEquals(emptyInput, StringReverse.reverse(emptyInput));
    }







}