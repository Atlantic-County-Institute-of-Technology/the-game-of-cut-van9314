// deck.java
// author: jvan
// created 10/28/25
// last updated 10/28/25
// description: This java class contains ONLY the deck object
import java.util.Random;

public class deck {
     Card[] deck = new Card[52];


    public void newDeck(){
        int index = 0;
        for(int x = 1; x < 14; x++){
            for(int y = 1; y < 5; y++ ){
                Card card = new Card(x,y);
                deck[index] = card; index++;
            }
        }
    }
    public void shuffle(){
        Random rand = new Random();
        Card temp;
        for(int x = 0; x < 52; x++){
            int randomIndex = rand.nextInt(52);
            temp = deck[x];
            deck[x] = deck[randomIndex];
            deck[randomIndex] = temp;
        }


    }


}
