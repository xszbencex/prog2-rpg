package hu.unideb.inf.room;

import hu.unideb.inf.factory.EnemyCreationService;
import hu.unideb.inf.model.Enemy;
import hu.unideb.inf.model.Player;
import hu.unideb.inf.factory.PlayerCreationService;

public class FirstRoom {

    public void enter() {
        PlayerCreationService playerCreationService = new PlayerCreationService();
        Player player = playerCreationService.create();
        System.out.println("Player created with details: " + player);

        EnemyCreationService enemyCreationService = new EnemyCreationService();

        Enemy enemy = enemyCreationService.create();
    }

}
