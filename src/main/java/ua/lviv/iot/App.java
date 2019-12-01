package ua.lviv.iot;

/**
 * Hello world!
 *
 */
public class App
{

    public static final String HARD = "/Users/admin/Documents/studying/scala/electr/src/main/java/ua/lviv/iot/hard.txt";

    public static void main(String[] args )
    {
        System.out.println(PillarScanner.getMaxLengthFromFile(HARD));
    }

}
