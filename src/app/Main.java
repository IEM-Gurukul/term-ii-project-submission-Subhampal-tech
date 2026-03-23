package app;

import engine.TurnManager;
import model.Player;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player(1, "Player1", 'X');
        Player p2 = new Player(2, "Player2", 'O');

        List<Player> players = Arrays.asList(p1, p2);

        TurnManager turnManager = new TurnManager(players);

        System.out.println("Current Player: " + turnManager.getCurrentPlayer());
        turnManager.nextTurn();
        System.out.println("Next Player: " + turnManager.getCurrentPlayer());
    }
}