package tddAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testThatObjectExist(){
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    @Test
    void addNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.addTwoNumbers(2,3));
    }

}