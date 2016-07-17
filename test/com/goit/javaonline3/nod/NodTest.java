package com.goit.javaonline3.nod;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Ler4enko on 17.07.2016.
 */
public class NodTest {

    @Test(timeout = 3000)
    public void testFindNodForPositiveNumbers() throws Exception {
        assertTrue(5 == Nod.findNod(25, 5));
    }

    @Test(timeout = 3000)
    public void testFindNodForNegativeNumbers() throws Exception {
        assertTrue(5 == Nod.findNod(-25, -5));
    }

    @Test(timeout = 3000)
    public void testFindNodForHybridNumbers() throws Exception {
        assertTrue(5 == Nod.findNod(-5, 25));
    }

    @Test(timeout = 3000)
    public void testFindNodForPrimeNumbers() throws Exception {
        assertTrue(1 == Nod.findNod(7, 13));
    }

    @Test(timeout = 3000)
    public void testFindNodForZero() throws Exception {
        assertTrue(0 == Nod.findNod(100500, 0));
    }

    @Test(timeout = 3000)
    public void testFindNodForSameNumbers() throws Exception {
        assertTrue(100500 == Nod.findNod(100500, 100500));
    }
}