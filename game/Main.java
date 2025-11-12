// Main.java
// author: jvan
// created: 10/28/25
// last updated 10/28/25
// description: This main java file handles user input, and effectively runs the entire game program
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The Game of Cut Starts!");
        deck myDeck = new deck();
        myDeck.newDeck();
        myDeck.shuffle();
        System.out.println(myDeck.deck[7]);
    }
}
