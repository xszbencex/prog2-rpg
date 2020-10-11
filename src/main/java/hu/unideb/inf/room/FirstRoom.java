package hu.unideb.inf.room;

import hu.unideb.inf.model.Player;
import hu.unideb.inf.service.PlayerCreationService;

public class FirstRoom {

    public void enter() {
        PlayerCreationService playerCreationService = new PlayerCreationService();
        Player player = playerCreationService.create();
        System.out.println("Player created with details: " + player);
    }

}
