/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roodie
 */
import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

 

public class DisabledTestExample {

 

    @Test

    void activeTest() {

        System.out.println("This test will run");

    }

 

    @Disabled

    @Test

    void disabledTest() {

        System.out.println("This test will NOT run");

    }

}


