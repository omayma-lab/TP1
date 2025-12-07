package com.omayma.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private Calculator c;
    @BeforeEach
    void setUp(){
        c= new Calculator();
        System.out.println("---Début du test ---");
    }
    @AfterEach
    void tearDown(){
        System.out.println("--- Fin du test ---");
    }
        @Test
        public void testAddition(){

            assertEquals(7, c.add(3,4));
        }
        @Test
        public void testDivision(){

            assertEquals(5, c .divide(10,2));
        }
        @Test

        public void testDivisionByZero() {

            assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
        }

    }

