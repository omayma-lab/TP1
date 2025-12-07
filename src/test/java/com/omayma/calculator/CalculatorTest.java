package com.omayma.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

        @Test
        public void testAddition(){

            assertEquals(7, Calculator.add(3,4));
        }
        @Test
        public void testDivision(){

            assertEquals(5, Calculator.divide(10,2));
        }
        @Test

        public void testDivisionByZero() {

            assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0));
        }

    }

