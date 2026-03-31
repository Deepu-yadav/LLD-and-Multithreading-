package ElevatorySystem;

public class FloorButton {

    private int floorNumber;
    private boolean isPressed;

    public FloorButton(int floorNumber){
        this.floorNumber=floorNumber;
        this.isPressed=false;
    }
    public void press(){
        this.isPressed=true;
    }
}
