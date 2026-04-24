/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roodie
 */
import org.junit.jupiter.api.*;

 

public class LifecycleExample {

 

    @BeforeEach

    void beforeEach() {

        System.out.println("Before each test");

    }

 

    @Test

    void testOne() {

        System.out.println("Executing Test One");

    }

 

    @Test

    void testTwo() {

        System.out.println("Executing Test Two");

    }

 

    @AfterEach

    void afterEach() {

        System.out.println("After each test");

    }

}