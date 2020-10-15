package hu.unideb.inf.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Data
@SuperBuilder
@NoArgsConstructor
public class Entity {

    private String name;
    private int health;
    private int damage;
    private int level;
    private Armor armor;
    private Weapon weapon;

    @Builder.Default
    private List<Effect> effects = new LinkedList<>();

    public int takeDamage(int damage) {
        var maxDefense= Optional.ofNullable(armor).map(Armor::getDefense).orElse(0f);
        damage = Math.round(damage * (1 - maxDefense));
        this.health -= damage;
        return damage;
    }

}
