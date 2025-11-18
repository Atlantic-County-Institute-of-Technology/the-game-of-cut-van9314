// Main.java
// author: jvan
// created: 10/28/25
// last updated 11/18/25
// description: This main java file handles user input, and effectively runs the entire game program
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int startGame = 0;
        int playerWins = 0;
        int cpuWins = 0;
        int playerInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("The Game of Cut Starts!");
        System.out.println("Choose card between 0-51:");
        playerInput = scan.nextInt();
        deck myDeck = new deck();
        myDeck.newDeck();
        myDeck.shuffle();
//        System.out.println(myDeck.deck[7]);
        while(playerWins < 3 || cpuWins < 3){
            System.out.println("Continue");

        }






    }
}
