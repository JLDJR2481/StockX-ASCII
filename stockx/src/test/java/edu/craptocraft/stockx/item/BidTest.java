package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BidTest {

    @Test
    public void constructorTest() {

        Bid bid = new Bid("9.5", 282);

        assertNotNull(bid);
        assertEquals(282, bid.value());
        assertEquals("9.5", bid.size());
        ;
    }

}
