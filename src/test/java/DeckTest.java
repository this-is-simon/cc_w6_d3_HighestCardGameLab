import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck(51);
    }

    @Test
    public void canAddCardToDeck(){
        assertEquals(52, deck.addCardToDeck());
    }

    @Test
    public void canPopulateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.numberOfCards());
    }

}



