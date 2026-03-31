package SnakeAndLadder;

public class Player {

    private int id;
    private int position;

    Player(int id){
        this.position=0;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
