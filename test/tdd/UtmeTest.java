package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UtmeTest {

    @Test
    public void priceForOneToFourCopiesTest(){
        //given there is a store TestDriller
        TestDriller sales = new TestDriller();
        //given a customer buys 3 copies
        int checkOut = sales.costTotal(3);
        assertEquals(6000, checkOut);
    }

    @Test
    public void priceForFiveToNineCopiesTest() {
        //given there is a store called TestDriller
        TestDriller sales = new TestDriller();
        //given a customer buys 9 copies
        int checkOut = sales.costTotal(9);
        assertEquals(16200, checkOut);
    }

    @Test
    public void priceForTenToTwentyNineCopiesTest (){
        //given there is a store called TestDriller
        TestDriller sales = new TestDriller();
        //given a customer buys 29 copies
        int checkOut = sales.costTotal(29);
        assertEquals(46400, checkOut);
    }

    @Test
    public void priceForThirtyToFourtyNineCopiesTest() {
        //given there is a store called TestDriller
        TestDriller sales = new TestDriller();
        //given a customer buys 49 copies
        int checkOut = sales.costTotal(49);
        assertEquals(73500, checkOut);
    }

    @Test
    public void priceForFiftyToNinetyNineCopiesTest() {
        //given there is a store called TestDriller
        TestDriller sales = new TestDriller();
        //given a customer buys 99 copies
        int checkOut = sales.costTotal(99);
        assertEquals(128700, checkOut);
    }

    @Test
    public void priceForHundredToHundredAndNinetyNineCopiesTest(){
        //given there is a store called TestDriller
        TestDriller sales = new TestDriller();
        //given a customer buys 199 copies
        int checkOut = sales.costTotal(100);
        assertEquals(120000,checkOut);
    }

    @Test
    public void priceForTwoHundredToFourHundredAndNinetyNineCopiesTest(){
        //given there is a store called TestDriller
        TestDriller sales = new TestDriller();
        //given a customer buys 400 copies
        int checkOut = sales.costTotal(400);
        assertEquals(440000, checkOut);
    }

    @Test
    public void priceForFiveHundredCopiesAndAboveCopiesTest(){
        //given there is a store called TestDriller
        TestDriller sales = new TestDriller();
        //given a customer buys 800 copies
        int checkOut = sales.costTotal(800);
        assertEquals(800000, checkOut);
    }
}
