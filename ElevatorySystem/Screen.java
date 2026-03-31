package ElevatorySystem;

public class Screen {

    private int currFloor;
    private Direction direction;

    public void show(int currFloor,Direction direction){
        this.currFloor=currFloor;
        this.direction=direction;
    }

}
