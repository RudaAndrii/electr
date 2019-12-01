package ua.lviv.iot;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class PillarUtil {
    private Double getDistance(Integer distance, Integer leftPillarHeight, Integer rightPillarHeight) {
        return Math.sqrt(Math.pow(distance, 2) + Math.pow(leftPillarHeight - rightPillarHeight, 2));
    }

    public Double calculateMaxLength(Integer distance, List<ElectricPillar> pillars) {
        Double first = 0D, second = 0D;

        for (int i = 0;i < pillars.size() - 1; i++) {
            Double firstTemp = first;
            Double secondTemp = second;

            Double floorToFloor = getDistance(distance, pillars.get(i).getMinHeight(), pillars.get(i+1).getMinHeight());
            Double floorToTop = getDistance(distance, pillars.get(i).getMinHeight(), pillars.get(i+1).getMaxHeight());
            Double topToFloor = getDistance(distance, pillars.get(i).getMaxHeight(), pillars.get(i+1).getMinHeight());
            Double topToTop = getDistance(distance, pillars.get(i).getMaxHeight(), pillars.get(i+1).getMaxHeight());

            first = Math.max((floorToFloor + firstTemp), (topToFloor + secondTemp));
            second = Math.max((topToTop + secondTemp), (floorToTop + firstTemp));
        }

        return Math.max(first, second);

    }
}