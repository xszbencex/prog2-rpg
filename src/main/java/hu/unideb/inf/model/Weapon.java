package hu.unideb.inf.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Weapon {

    private String name;
    private int level;
    private int damage;
    private Effect effect;

}
