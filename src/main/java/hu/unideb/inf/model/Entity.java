package hu.unideb.inf.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class Entity {

    private String name;
    private int health;
    private int damage;
    private int level;
    private Gear gear;

}
