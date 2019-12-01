package ua.lviv.iot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PillarScanner {
    public static final double ERROR = -1D;

    public static Double getMaxLengthFromFile(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));
            Integer distance = scanner.nextInt();
            List<ElectricPillar> pillars = new ArrayList<ElectricPillar>();

            while (scanner.hasNextInt()) {
                pillars.add(new ElectricPillar(scanner.nextInt()));
            }

            return PillarUtil.calculateMaxLength(distance, pillars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return ERROR;
        }
    }
}