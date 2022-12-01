package service;

import models.*;

import java.util.*;

public class SnakeAndLadder {

    final int DICE_MAX = 6;
    int dest;
    Queue<Player> players;
    HashMap<Integer, Integer> jumpers;
    public SnakeAndLadder(int n)
    {
        dest = n;
        players = new LinkedList<>();
        jumpers = new HashMap<>();
    }

    public void initializeGame(List<Player> p, List<Jumper> j)
    {
        for(int i=0; i<p.size(); i++)
        {
            players.add(p.get(i));
        }
        for(int i=0; i< j.size(); i++)
        {
            jumpers.put(j.get(i).getStart(), j.get(i).getEnd());
        }
    }
    public Player startGame()
    {
        Random rand = new Random();

        while(true)
        {
            Player turn = players.remove();
            int dice = rand.nextInt(1,DICE_MAX);
            System.out.println("Player " + turn.getName() + " got " + dice);
            int pos = turn.getNumber() + dice;
            if(pos == dest)
            {
                return turn;
            }
            if(jumpers.containsKey(pos))
            {
                int newPos = jumpers.get(pos);
                turn.setNumber(newPos);
                System.out.println("Player " + turn.getName() + " jumps to " + turn.getNumber() + " from " + pos);
            }
            else if(pos < dest)
            {
                turn.setNumber(pos);
                System.out.println("Player " + turn.getName() + " moves to " + turn.getNumber());
            }
            players.add(turn);
        }
    }
}
