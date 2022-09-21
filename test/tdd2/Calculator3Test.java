package tdd2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator3Test {
    Calculator3 calculator3 = new Calculator3();

    @Test
    void testThatObjectExist(){
        assertNotNull(calculator3);
    }

    @Test
    void sum(){
        assertEquals(5,calculator3.addTwoNumbers(2,3));
    }

    @Test
    void subtract(){
        assertEquals(10,calculator3.minusTwoNumbers(20,10));
    }

    @Test
    void multiply(){
        assertEquals(10,calculator3.multiplyTwoNumbers(2,5));
    }
    @Test
    void testUserCanNotInputANegativeNumber(){
       assertEquals(22, calculator3.collectUserInput(5,15,2));
    }

}