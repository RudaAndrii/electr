package ua.lviv.iot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ElectricPillar {
    private final Integer minHeight = 1;
    private Integer maxHeight;
}
