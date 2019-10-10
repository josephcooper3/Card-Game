import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;

    @Before
    public void before(){
        player1 = new Player("Gert");
    }

    @Test
    public void canGetName(){
        assertEquals("Gert", player1.getName());
    }

}
