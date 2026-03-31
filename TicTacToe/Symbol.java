package TicTacToe;

import javax.swing.*;

public enum Symbol {

    X("X"),    // You can think of them like objects created automatically by Java,and also Enum has Constructor Symbol
    O("O");

    private final String value;
    Symbol(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
