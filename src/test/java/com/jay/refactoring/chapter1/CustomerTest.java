package com.jay.refactoring.chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Customer测试
 *
 * @author zhongshuo.xwj
 */
public class CustomerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStatement() {
        // prepare data
        Movie movieOne = new Movie("War", Movie.NEW_RELEASE);
        Movie movieTwo = new Movie("Change", Movie.CHILDREN);
        Movie movieThree = new Movie("Tang", Movie.REGULAR);

        Rental rentalOne = new Rental(movieOne, 2);
        Rental rentalTwo = new Rental(movieTwo, 1);
        Rental rentalThree = new Rental(movieThree, 4);

        Customer customer = new Customer("Jay");
        customer.addRental(rentalOne);
        customer.addRental(rentalTwo);
        customer.addRental(rentalThree);

        // assert
        String expectResult = "Rental Record for Jay\n\tWar\t6.0\n\tChange\t1.5\n\tTang\t5.0\nAmount owned is 12.5\n" +
                "You earned 4 frequent renter points";
        assertEquals(expectResult, customer.statement());
    }


}