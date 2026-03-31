package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    Board board;
    Deque<Player>players;

     Game(int size){
        board=new Board(size);
        players=new LinkedList();
      }

    public void addPlayer(Player player){
        players.add(player);

    }
    public void startGame(){
          Player winner=null;
        Scanner sc=new Scanner(System.in);

          while (true){
              Player p1=players.pollFirst();
              int row=sc.nextInt();
              int col=sc.nextInt();
              boolean moved=board.placeMove(row,col,p1.getSymbol());
              if(!moved){
                  System.out.println("Invalid move Please try again");
                  players.addFirst(p1);
                  continue;
              }
              if(board.checkWinner(row,col,p1.getSymbol())){
                  winner=p1;
                  break;
              }
              players.addLast(p1);
          }
          System.out.println("Player with this id"+winner.getId()+"is win the game");
    }


}
