import org.junit.Test;
import org.junit.Before;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Deck deck;
    Player player1;
    Player player2;


    @Before
    public void before(){
        deck = new Deck(52);
        deck.populateDeck();
        player1 = new Player("Juan Pablo");
        player2 = new Player("Mauricio Escobar");

    }

    @Test
    public void playersGetCards(){
        player1.receiveShuffledCard(deck);
        player2.receiveShuffledCard(deck);
        assertEquals(1, player1.hasCards());
        assertEquals(1, player2.hasCards());
    }

    @Test
    public void testForWinner(){

    }
}
