import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public int hasCards(){
        return this.hand.size();
    }

    public void receiveShuffledCard(Deck deck){
        hand.add(deck.getShuffledCard());
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }

    public int getValueFromCard(){
        return this.hand.get(0).getValueFromEnum();
    }
}
