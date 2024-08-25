package com.zulfiqarjunejo.leftpad;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeftPadderTest {
    @Test
    public void shouldAddFiveAstericks() {
        var lp = new LeftPadder();
        
        var result = lp.pad("Hello", 10, '*');
        var expected = "*****Hello";

        assertEquals(expected, result);
    }

    @Test
    public void shouldAddFiveSpaces() {
        var lp = new LeftPadder();

        var result = lp.pad("Hello", 10);
        var expected = "     Hello";

        assertEquals(expected, result);
    }

    @Test
    public void shouldAddOneSpace() {
        var lp = new LeftPadder();

        var result = lp.pad("Hello",6);
        var expected = " Hello";

        assertEquals(expected, result);
    }

    @Test
    public void shouldAddNothing() {
        var lp = new LeftPadder();

        var result = lp.pad("Hello", 5);
        var expected = "Hello";

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTheOriginalIfLongerThanLength() {
        var lp = new LeftPadder();

        var result = lp.pad("Hello", 3);
        var expected = "Hello";

        assertEquals(expected, result);
    }
}
