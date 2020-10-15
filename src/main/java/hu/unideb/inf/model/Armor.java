package hu.unideb.inf.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Armor {

    private String name;
    private float defense;
    private int level;
    private Effect effect;

}
