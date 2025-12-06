package com.omayma.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
        @Test
        public void testAddition(){
            Calculator c = new Calculator();
            assertEquals(7, c.add(3,4));
        }
        @Test
        public void testDivision(){
            Calculator c =new Calculator();
            assertEquals(5, c .divide(10,2));
        }
        @Test
        public void testDivisionByZero() {
            Calculator c = new Calculator();
            assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
        }

    }

