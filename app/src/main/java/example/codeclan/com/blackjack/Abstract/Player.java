package example.codeclan.com.blackjack.Abstract;

import example.codeclan.com.blackjack.model.Card;
import example.codeclan.com.blackjack.model.Hand;

/**
 * Created by user on 23/01/2017.
 */

public class Player extends User {

    public Player(Hand hand) {
        super(hand);
        showAllCards();
    }

    @Override
    public void setHand(Hand hand) {
        super.setHand(hand);
        showAllCards();
    }

    private void showAllCards() {
        for (Card card : getHand().getCards()) {
            card.showCard();
        }
    }
}

