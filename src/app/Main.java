package app;

import model.Player;
import model.Move;
import model.GameState;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player(1, "Player1", 'X');
        Player p2 = new Player(2, "Player2", 'O');

        Move move = new Move(p1, 1, 2);

        System.out.println(p1);
        System.out.println("Move at: " + move.getRow() + "," + move.getCol());
        System.out.println("Game State: " + GameState.ONGOING);
    }
}