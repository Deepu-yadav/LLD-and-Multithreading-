package ElevatorySystem;

import java.security.PrivateKey;
import java.util.LinkedList;
import java.util.PrimitiveIterator;
import java.util.Queue;

public class Elevator {

    private int currFloor;
    private Direction direction;
    private Queue<Integer>request;
    private int id;
    private Screen screen;

    public Elevator(int id){
        this.currFloor=0;
        this.direction=Direction.IDLE;
        request=new LinkedList<>();
        this.id=id;
        screen=new Screen();
    }

    public void addRequest(int floorNumber){
        request.add(floorNumber);
    }
    public void move(){
        if(request.isEmpty()){
            return;
        }
        int destination= request.poll();
        if(destination>currFloor){
            direction=Direction.UP;
        }
        else{
            direction=Direction.DOWN;
        }
        screen.show(destination,direction);
        currFloor=destination;
    }

}
