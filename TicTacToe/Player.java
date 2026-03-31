package TicTacToe;

public class Player {

    private int id;
    private Symbol symbol;

     public Player(int id,Symbol symbol){
        this.id=id;
        this.symbol=symbol;
     }

    public int getId() {
        return id;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
