import java.util.ArrayList;

public class Game {
    private Deck deck;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2, Deck deck){
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
        play();
    };

    public void play(){
        this.deck.shuffleDeck();
        deal();
        checkForWinner();
    }

    public void deal(){
        player1.receiveShuffledCard(this.deck);
        player2.receiveShuffledCard(this.deck);
    }

    public Player checkForWinner(){

        if (player1.getValueFromCard() > player2.getValueFromCard()){
            return player1;
        } else if (player1.getValueFromCard() < player2.getValueFromCard())
        {
            return player2;
        } else {
            return null;
        }

    }


}
