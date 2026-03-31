package TicTacToe;

public class Board {

    Symbol[][]grid;
    private int size;

    Board(int size){
        grid=new Symbol[size][size];
        this.size=size;
    }

    public Symbol[][] getSymbols() {
        return grid;
    }

    public int getSize() {
        return size;
    }

    public boolean placeMove(int row,int col,Symbol symbol){
        if(row < 0 || col < 0 || row >= size || col >= size)
            return false;
        if(grid[row][col]!=null){
            return false;
        }
        grid[row][col]=symbol;
        return true;
    }
    public boolean checkWinner(int row,int col,Symbol symbol){

        boolean rowWin = true;
        boolean colWin = true;
        boolean diagWin = true;
        boolean antiDiagWin = true;

        for(int i=0;i<size;i++){

            if(grid[row][i] != symbol)
                rowWin = false;

            if(grid[i][col] != symbol)
                colWin = false;

            if(grid[i][i] != symbol)
                diagWin = false;

            if(grid[i][size-i-1] != symbol)
                antiDiagWin = false;
        }

        return rowWin || colWin || diagWin || antiDiagWin;
    }
}
