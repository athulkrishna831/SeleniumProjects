
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roodie
 */
@TestMethodOrder(MethodOrderer.MethodName.class) // Sorts by method name

public class AlphabeticalTest {

 

    @Test

    void z_test() { System.out.println("Runs 1st"); }

 

    @Test

    void b_test() { System.out.println("Runs 2nd"); }

 

    @Test

    void c_test() { System.out.println("Runs 3rd"); }

}
