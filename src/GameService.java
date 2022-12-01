import models.Jumper;
import models.Player;
import service.SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake and ladder");

        Player player1  = new Player(1, "Juhi");
        Player player2  = new Player(2, "Harsh");
        Player player3  = new Player(3, "Pepper");
        Player player4  = new Player(4, "Sushi");
        List<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        //playerList.add(player3);
        //playerList.add(player4);

        List<Jumper> jumpers = new ArrayList<>();
        jumpers.add(new Jumper(5, 21));
        jumpers.add(new Jumper(81, 7)); // snake
        jumpers.add(new Jumper(66, 49)); // snake
        jumpers.add(new Jumper(20, 54));

        SnakeAndLadder sal = new SnakeAndLadder(100);
        sal.initializeGame(playerList, jumpers);

        Player winner = sal.startGame();
        System.out.println("Winner is " + winner.getName() + " " + winner.getId());
    }
}
