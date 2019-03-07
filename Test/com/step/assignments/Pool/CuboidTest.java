package com.step.assignments.Pool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void getVolume() {
        Cuboid c1 = new Cuboid(2, 3, 6);
        double actual = c1.getVolume();
        double expected = 36;
        assertEquals(expected, actual);
    }
}