package com.step.assignments;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getVolume() {
        Cylinder c1 = new Cylinder(5.55, 7.25);
        double actual = c1.getVolume();
        double expected = 701.574580913447;
        assertEquals(expected, actual);
    }

    @Test
    void getArea() {
        Cylinder c1 = new Cylinder(5.55, 7.25);
        double actual = c1.getArea();
        double expected = 446.3574842220378;
        assertEquals(expected, actual);
    }
}