import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> allCards;
    private int numberOfCards;

    public Deck(int numberOfCards){
        this.allCards = new ArrayList<>();
        this.numberOfCards = numberOfCards;
    }

    public int addCardToDeck(){
       return this.numberOfCards += 1;
    }

    public int numberOfCards(){
        return this.allCards.size();
    }

    public void populateDeck(){

//        System.out.println("START!");
        for (RankType rank : RankType.values()){
//            System.out.println("--FOR EACH RANK: " + rank.name());

            for (SuitType suit : SuitType.values()){

//                System.out.println("----CREATE A CARD: " + rank.name() + " of "+ suit.name());

                Card newCard = new Card(suit, rank);
                allCards.add(newCard);

            }
        }

    }

    public void shuffleDeck(){
        Collections.shuffle(allCards);
    }

    public Card getShuffledCard(){
        return this.allCards.remove(0);
    }

}
