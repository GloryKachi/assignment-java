package ChapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {
    Range range;

    @BeforeEach
    void setUp(){
        range = new Range();
    }
     @Test
    void testThatObjectExist(){
        assertNotNull(range);
     }
     @Test
    void testThatUserCanInputInteger() {
         assertEquals(9, range.getUserInput(3, 5, 1));
    }
    @Test
    void testSumOfInput(){
        assertEquals(5,range.getSumOfInput(2,2,1));
    }
    @Test
    void testAverageOfInput(){
        assertEquals(2,range.getAverageInput(4,2,1));
    }
    @Test
    void testProductOfInput(){
        assertEquals(32,range.getInputProduct(2,4,4));
    }
    @Test
    void testTheSmallestNumber(){
        assertTrue(range.getSmallestNumber(9,9,9));
    }
    @Test
    void testTheLargestNumber(){
        assertTrue(range.getLargestNumber(1,12,10));
    }

}