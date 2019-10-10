import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.DIAMONDS, RankType.ACE);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getCardCount());
    }

    @Test
    public void canAddCard(){
        deck.addCard(card);
        assertEquals(1, deck.getCardCount());
    }

    @Test
    public void canAddAllCards(){
        deck.addAllCards();
        assertEquals(52, deck.getCardCount());
    }

    @Test
    public void canFindCard(){
        deck.addAllCards();
        Card foundCard = deck.findCard(1);
        assertEquals(SuitType.DIAMONDS, foundCard.getSuit());
        assertEquals(RankType.TWO, foundCard.getRank());
    }

    @Test
    public void canGetCardFromDeck(){
        deck.addAllCards();
        deck.shuffle();
        deck.dealCard();
        assertEquals(51, deck.getCardCount());
    }

}
