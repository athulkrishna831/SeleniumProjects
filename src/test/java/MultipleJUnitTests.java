/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roodie
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 

public class MultipleJUnitTests {

 

    @Test

    void testAddition() {

        assertEquals(30, 10 + 20);

        System.out.println("Addition test passed");

    }

 

    @Test

    void testSubtraction() {

        assertEquals(10,20 - 10);

        System.out.println("Subtraction test passed");

    }

}
