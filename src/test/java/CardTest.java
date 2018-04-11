import org.junit.Before;
import org.junit.Test;

public class CardTest {

    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

}
