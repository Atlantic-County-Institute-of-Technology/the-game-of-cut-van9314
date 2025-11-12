// card.java
// author: jvan
// created 10/28/25
// last updated 10/28/25
// description: This java class contains the set of 52 unique cards representing the card object


public class card {
    private final String[] faces = {null, "Ace", "1", "2", "10", "Jack", "Queen", "King"};
    private final String[] suits = {null, "Spades", "Hearts", "Clubs", "Diamonds"};

    public static void main(String[] args) {
        final int face;
        final int suit;


    }
    public card(int face, int suit){
        this.face = face;
        this.suit = suit;
    }

    // Getter method instantiation

    public int getFace(){ return face; }

    public int getSuit(){ return suit; }

    public String toString(){return faces[face] + " of " + suits[suit];}

}
