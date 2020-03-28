package ru.sbrf.lesson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void add() {
        Calc calc = new Calc();

        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void substr(){
        Calc calc = new Calc();

        assertEquals(8, calc.substr(10, 2));
    }

    @Test
    public void mult() {
        Calc calc = new Calc();

        assertEquals(56,calc.mult(7,8));
    }

    @Test
    public void div() {
        Calc calc = new Calc();

        assertEquals(4,calc.div(12,3));
        assertEquals(5,calc.div(30,6));
    }
}