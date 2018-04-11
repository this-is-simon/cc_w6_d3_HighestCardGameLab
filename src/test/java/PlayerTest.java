import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("Juan Pablo");
        player2 = new Player("Pablo Escobar");
        deck = new Deck(52);
        deck.populateDeck();
    }

    @Test
    public void playerHasEmptyHand(){
    assertEquals(0, player1.hasCards());}

    @Test
    public void player1HasACard(){
        player1.receiveShuffledCard(deck);
        assertEquals(1, player1.hasCards());
    }

    @Test
    public void player2HasACard(){
        player2.receiveShuffledCard(deck);
        assertEquals(1, player2.hasCards());
    }






}
