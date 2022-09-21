package bike;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {
    Bike bike;
    @BeforeEach
    public void setUp(){
    bike = new Bike();
    }

    @Test
    public void bikeIsOnTest() {
    bike.isOn();
    bike.turnOn();
    assertTrue(bike.isOn());
    }

    @Test
    public void bikeIsOffTest(){
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        assertFalse(bike.isOn());
    }

}

