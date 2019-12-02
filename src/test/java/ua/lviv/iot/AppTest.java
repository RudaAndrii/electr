package ua.lviv.iot;

import org.junit.Assert;
import org.junit.Test;

public class AppTest
{
    public static final String EASY = "/Users/admin/Documents/studying/scala/electr/src/main/java/ua/lviv/iot/easy.txt";
    public static final String MEDIUM = "/Users/admin/Documents/studying/scala/electr/src/main/java/ua/lviv/iot/medium.txt";
    public static final String HARD = "/Users/admin/Documents/studying/scala/electr/src/main/java/ua/lviv/iot/hard.txt";
    public static final String AAA = "/Users/admin/Documents/studying/scala/electr/src/main/java/ua/lviv/iot/aaaa.txt";

    /**
     * Rigorous Test :-)
     */
    @Test
    public void easyTest() {
        Assert.assertEquals(5, PillarScanner.getMaxLengthFromFile(EASY).intValue());
    }


    @Test
    public void mediumTest() {
        Assert.assertEquals(396, PillarScanner.getMaxLengthFromFile(MEDIUM).intValue());
    }

    @Test
    public void hardTest() {
        Assert.assertEquals(2738, PillarScanner.getMaxLengthFromFile(HARD).intValue());
    }
}
