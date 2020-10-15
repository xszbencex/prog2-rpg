package hu.unideb.inf.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Player extends Entity {

    private int experiencePoints;
    private int gold;

    //TODO: inventory

}
