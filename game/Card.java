// Card.java
// author: jvan
// created 10/28/25
// last updated 10/28/25
// description: This java class contains the set of 52 unique cards representing the card object


public class Card
    {
        final int face;
        final int suit;
    private final String[] faces = {null, "Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final String[] suits = {null, "Spades", "Hearts", "Clubs", "Diamonds"};



    public Card(int face, int suit) {
        this.face = face;
        this.suit = suit;
    }

    // Getter method instantiation
//
//    public int getFace(){ return face; }
//
//    public int getSuit(){ return suit; }

    public String toString() {return faces[face] + " of " + suits[suit];}

}
