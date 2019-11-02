package celcius;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FahrenheitCelciusConverterTest {

    private final Object[][] getInputs() {
        return new Object[][] {
                {32, 0},
                {98 , 37},
                {212, 100}
        };
    }

    @Test
    @Parameters(method = "getInputs")
    public void shouldConvertCelciusToFahrenheit(long fahrenheit, long celcius) {
        assertEquals(fahrenheit, FahrenheitCelciusConverter.toFahrenheit(celcius));
    }

    @Test
    public void shouldConvertFahrenheitToCelcius(long fahrenheit, long celcius) {
        assertEquals(celcius, FahrenheitCelciusConverter.toCelcius(fahrenheit));
    }
}