/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roodie
 */
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ValueSource;

 

import static org.junit.jupiter.api.Assertions.assertTrue;

 

public class ParameterizedExample {

 

    @ParameterizedTest

    @ValueSource(strings = {"Java", "JUnit", "Testing",""})

    void parameterizedTest(String value) {

        assertTrue(value.length() > 0);

        System.out.println("Value: " + value);

    }

}
