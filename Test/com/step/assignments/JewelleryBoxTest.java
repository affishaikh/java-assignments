package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelleryBoxTest {

    @Test
    void shouldReturnOneWhenOnlyOneJewellery() {
        Jewellery j1 = new Jewellery("Platinum", 100000);
        JewelleryBox jb1 = new JewelleryBox(j1);
        int actual = jb1.getNumberOfJewelleries();
        int expected =1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTwoWhenBothJewelleryBoxHasOneJewelleryInsideIt() {
        Jewellery j1 = new Jewellery("Platinum", 100000);
        Jewellery j2 = new Jewellery("Gold", 100000);
        JewelleryBox jb1 = new JewelleryBox(j1);
        JewelleryBox jb2 = new JewelleryBox(j2, jb1);
        int actual = jb2.getNumberOfJewelleries();
        int expected =2;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOneWhenOnlyOneJewelleryBoxHasOneJewelleryInsideIt() {
        Jewellery j1 = new Jewellery("Platinum", 100000);
        JewelleryBox jb1 = new JewelleryBox(j1);
        JewelleryBox jb2 = new JewelleryBox(jb1);
        int actual = jb2.getNumberOfJewelleries();
        int expected =1;
        assertEquals(expected, actual);
    }

    @Test
    void name() {
        JewelleryBox _5thLevelBox = new JewelleryBox();

        JewelleryBox _4thLevelBox = new JewelleryBox(_5thLevelBox);

        Jewellery necklace = new Jewellery("necklace", 10000);
        JewelleryBox _3rdLevelBox = new JewelleryBox(necklace, _4thLevelBox);

        Jewellery ring = new Jewellery("ring", 5000);
        JewelleryBox _2ndLevelBox = new JewelleryBox(ring, _3rdLevelBox);

        JewelleryBox _1stLevelBox = new JewelleryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.getNumberOfJewelleries());
    }
}