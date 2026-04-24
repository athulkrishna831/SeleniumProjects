/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roodie
 */
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.condition.*;

 

public class ConditionalExecutionExample {

 

    @Test

    @EnabledOnOs(OS.WINDOWS)

    void runOnWindowsOnly() {

        System.out.println("Running on Windows");

    }

 

    @Test

    @EnabledOnJre(JRE.JAVA_17)

    void runOnJava17Only() {

        System.out.println("Running on Java 17");

    }

}
