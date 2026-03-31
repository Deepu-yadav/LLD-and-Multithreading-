package SnakeAndLadder;

public class Board {

    Cell[]cells;
    private static int boardSize=101;

   public Board(){
      cells=new Cell[boardSize];
      for(int i=1; i<=100; i++){
          cells[i]=new Cell(i);
      }
       addLadder(3);
      addSnake(3);

    }

    // this is the configurable size of our board,we can take input from use how many snake and ladder they want
    public Board(int size,int snake,int ladder){
        cells=new Cell[size+1];
        for(int i=1; i<=size; i++){
            cells[i]=new Cell(i);
        }
        addLadder(ladder);
        addSnake(snake);


    }

    public void addLadder(int count){
      // statingPoint<endPoint

        while(count>0){
            int startingPoint=(int)(Math.random()*100);
            int endingPoint=(int)(Math.random()*100);

            if(startingPoint>endingPoint || startingPoint==0 || endingPoint==0){
                continue;
            }
            Jump jump=new Jump(startingPoint,endingPoint);
            Cell cell=cells[startingPoint];
            cell.setJump(jump);
            count--;
        }
    }

    public void addSnake(int count){
       // statingPoint>endPoint

        while(count>0){
            int startingPoint=(int)(Math.random()*100);
            int endingPoint=(int)(Math.random()*100);

            if(startingPoint>endingPoint || startingPoint==0 || endingPoint==0){
                continue;
            }
            Jump jump=new Jump(startingPoint,endingPoint);
            Cell cell=cells[startingPoint];
            if(cell.getJump()!=null)continue;
            cell.setJump(jump);
            count--;
        }

    }








}
