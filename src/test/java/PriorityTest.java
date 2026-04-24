/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roodie
 */
import org.junit.jupiter.api.*;

 

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // 1. Enable ordering

public class PriorityTest {

 

    @Test

    @Order(1) // 2. Highest priority

    void firstTest() {

        System.out.println("Running first...");

    }

 

    @Test

    @Order(2)

    void secondTest() {

        System.out.println("Running second...");

    }

 

    @Test

    @Order(3)

    void lastTest() {

        System.out.println("Running last...");

    }

}


