/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roodie
 */
import org.junit.jupiter.api.*;

 

public class BeforeAllAfterAllExample {

 

    @BeforeAll

    static void beforeAll() {

        System.out.println("Runs once before all tests");

    }

 

    @Test

    void testOne() {

        System.out.println("Test One executed");

    }

 

    @Test

    void testTwo() {

        System.out.println("Test Two executed");

    }

 

    @AfterAll

    static void afterAll() {

        System.out.println("Runs once after all tests");

    }

}