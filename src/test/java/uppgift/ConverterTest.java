package uppgift;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void testConvertAtoMorse() {
        Converter converter = new Converter();
        String text = "A";

        String actual = converter.convert(text);
        String expected = ".-";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertBtoMorse() {
        Converter converter = new Converter();
        String text = "B";

        String actual = converter.convert(text);
        String expected = "-...";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertABtoMorse() {
        Converter converter = new Converter();
        String text = "AB";

        String actual = converter.convert(text);
        String expected = ".- -...";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertMorseToBA() {
        Converter converter = new Converter();
        String text = "-... .-";

        String actual = converter.convertMorse(text);
        String expected = "BA";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertSymbolToMorse() {
        Converter converter = new Converter();
        String text = "A#";

        String actual = converter.convert(text);
        String expected = "Invalid input";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEmptyMorseInput() {
        Converter converter = new Converter();
        String text = "" ;

        String actual = converter.convert(text);
        String expected = "No input";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMultiplespaces() {
        Converter converter = new Converter();
        String text = "          " ;

        String actual = converter.convert(text);
        String expected = "No input";

        Assert.assertEquals(expected, actual);
    }
}