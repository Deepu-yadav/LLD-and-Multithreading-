package SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

     Deque<Player>players;
     Dice dice;
     Board board;

     public Game(){
       players=new LinkedList<>();
       dice=new Dice();
       board=new Board();
     }

     public void addPlayers(int count){
         for(int i=1; i<=count; i++){
             Player p1=new Player(i);
             players.add(p1);
         }
     }

     public void startGame(){

         Player winner=null;
         Cell[]cells=board.cells;

         while (true){
             Player p1=players.pollFirst();
             int currNumber=dice.rollDice();
             int position= p1.getPosition()+currNumber;
             if(position>100){
                 players.addLast(p1);
                 continue;
             }
             Cell cell=cells[position];
             if(cell.getJump()!=null){
                 if(cell.getJump().getStart()>cell.getJump().getEnd()){
                     position=cell.getJump().getEnd();
                 }
                 else{
                     position=cell.getJump().getEnd();
                 }
             }
             p1.setPosition(position);
             if(position==100){
                 winner=p1;
                 break;
             }
             else{
                 players.addLast(p1);
             }
         }

         System.out.println("Player with Id "+winner.getId()+ "is the Winner");

     }
}
