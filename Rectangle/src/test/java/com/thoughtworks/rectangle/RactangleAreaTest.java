package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RactangleAreaTest{
    @Test
    void areaIsMultipleOfLengthAndBreadth(){

        final RectangleArea rectArea = new RectangleArea();

        final int calculatedArea = rectArea.calculateArea(5,4);

        assertEquals(20, calculatedArea);

    }
}