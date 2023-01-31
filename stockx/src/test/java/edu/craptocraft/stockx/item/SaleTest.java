package edu.craptocraft.stockx.item;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaleTest {

    @Test
    public void constructorTest() {

        Sale sale = new Sale("11", 400);

        assertNotNull(sale);
        assertEquals("11", sale.size());
        assertEquals(400, sale.value());
    }

}
