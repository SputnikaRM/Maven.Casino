package io.zipcoder.casino.blackJack;

import io.zipcoder.casino.Card;
import io.zipcoder.casino.Hand;
import io.zipcoder.casino.Player;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class BlackjackPlayerTest {

    @Test
    public void discardHandTest() {
        Card kHearts = new Card;
        Card jSpades = new Card;
        Player player1 = new Player;

        BlackjackPlayer player = new BlackjackPlayer(player1);


        player.hit(kHearts);
        player.hit(jSpades);

        ArrayList<Card> myHand = player.getHand();

        assertFalse(myHand.isEmpty());

        player.discardHand();

        assertTrue(myHand.isEmpty());


    }

    @Test
    public void hit() {
    }

    @Test
    public void newSplitHand() {
    }

    @Test
    public void getHandValue() {
    }

    @Test
    public void bet() {
    }

    @Test
    public void getHand() {
    }
}