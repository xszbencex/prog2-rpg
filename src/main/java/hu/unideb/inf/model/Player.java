package hu.unideb.inf.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Player extends Entity {

    private int experiencePoints;
    private int gold;
    private List<Effect> effects;

    //TODO: inventory

}
