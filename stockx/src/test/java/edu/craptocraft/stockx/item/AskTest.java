package edu.craptocraft.stockx.item;

import static org.junit.Assert.*;

import org.junit.Test;

public class AskTest {

    @Test
    public void constructorTest() {
        Ask ask = new Ask("15", 288);
        assertNotNull(ask);
        assertEquals("15", ask.size());
        assertEquals(288, ask.value());
    }

}
