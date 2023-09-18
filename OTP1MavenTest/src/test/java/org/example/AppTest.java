package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    Laskin laskin = new Laskin();
    double DELTA = 0.01;
    @Test
    public void summaTest() {
        assertEquals(7, laskin.summa(4,3), DELTA);
    }

    @Test
    public void kerroTest() {
        assertEquals(15, laskin.kerro(3,5), DELTA);
    }

    @Test
    public void miinusTest() {
        assertEquals(9, laskin.miinus(17,8), DELTA);
    }
}
