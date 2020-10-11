package hu.unideb.inf.service;

import hu.unideb.inf.model.Player;

public class PlayerCreationService {

    public Player create() {
        return Player.builder()
                .name("Marci")
                .gold(10)
                .damage(5)
                .health(100)
                .experiencePoints(0)
                .level(1)
                .build();
    }

}
