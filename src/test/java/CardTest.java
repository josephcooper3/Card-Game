import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.DIAMONDS, RankType.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.DIAMONDS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.ACE, card.getRank());
    }

}
