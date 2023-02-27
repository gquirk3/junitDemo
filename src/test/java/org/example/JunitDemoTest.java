package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitDemoTest
{
    @Test
    public void shouldSquareNumber()
    {
        JunitDemo test = new JunitDemo();
        int output = test.square(5);
        assertEquals(25, output);
    }

    @Test
    public void shouldCountA()
    {
        JunitDemo test = new JunitDemo();
        int output = test.countA("Buffalo Sabres");
        assertEquals(2, output);
    }
}