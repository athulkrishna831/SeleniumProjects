/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roodie
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 

public class AssertionsExample {

 

    @Test

    void assertionTest() {

        assertEquals(5, 2 + 3);

        assertTrue(10 > 5);

        assertFalse(5 > 10);

        assertNotNull("JUnit");

    }

}

 
