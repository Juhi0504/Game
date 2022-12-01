package models;

public class Player
{
    int id;
    String name;

    int number;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        number = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
