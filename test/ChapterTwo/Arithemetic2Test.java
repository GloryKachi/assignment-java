package ChapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Arithemetic2Test {
    Arithemetic2 arithemetic2;

    @BeforeEach
    void setUp(){
        arithemetic2 = new Arithemetic2();
    }
    @Test
    void testThatObjectExist(){

        assertNotNull(arithemetic2);
    }
    @Test
    void testThatUserCanInputNumber(){
        assertEquals(8,arithemetic2.getIntegerFromUser(4,4));
    }
    @Test
    void testTheSquareOfNumber(){
        assertTrue(arithemetic2.getSquareFromInput(6,3));
    }
   @Test
   void sumTheSquareOfNumber(){
       assertEquals(40,arithemetic2.getSumOfSquare(6,2));
    }
    @Test
    void testTheDifferenceOfSquare(){
        assertEquals(0,arithemetic2.getSquareDifference(3,3));
    }

}