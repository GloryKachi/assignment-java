package ChapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonTest {
    Comparison comparison;

    @BeforeEach
    void setUp(){

    comparison = new Comparison();
    }
    @Test
    void testThatComparisonExist(){

        assertNotNull(comparison);
    }
    @Test
     void testThatUserCanInputInteger(){

        assertEquals(50,comparison.getUserInput(30,10,10));
    }
    @Test
     void testThatUserCanSubtractIntegerInput(){

        assertEquals(30,comparison.getSubtractedInput(50,10,10));
    }
    @Test
     void testUserInputIsGreaterThan100(){

        assertTrue(comparison.getGreaterThan100(200));
    }
    @Test
    void testThatSquareIsGreaterThan100(){

        assertTrue(comparison.getSquareIsGreaterThan100(200));
    }
    @Test
    void testThatUserInputIsLessThan100(){

        int userInputNumber = 50;

        assertTrue(comparison.getUserInputIsLessThan100(50));
    }
    @Test
    void testThatSquareIsLessThan100(){

        int number = 3;

        assertTrue(comparison.getSquareIsLessThan100(3));
    }
    @Test
    void testThatInputIsEqualTo100(){

        int number = 100;

        assertTrue(comparison.getIntegerIsEqualTo100(100));
    }
    @Test
    void testUserInputIsNotEqualTo100(){

        int number = 100;

        assertTrue(comparison.getUserInputNotEqualTo100(70));
    }

}
