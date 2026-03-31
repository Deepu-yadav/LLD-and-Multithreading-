package SnakeAndLadder;

public class Dice {

    // Math.random() is going to generate the random number between 0.0 to 0.999...
     public  int rollDice(){
        return (int)(Math.random()*6)+1;
     }
}
