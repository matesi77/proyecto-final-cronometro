package basicTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicJunit {

    //setup - initialize (Se ejecuta antes de cada test)
    @BeforeEach
    public void setup(){
        System.out.println("Before");
    }
    //cleanup - teardown (Se ejecuta despues de cada test)
    @AfterEach
    public  void cleanUp(){
        System.out.println("After");
    }
    @Test
    public void thisIsATest(){
        System.out.println("Test!!!");
    }
    @Test
    public void thisIsATest2(){
        System.out.println("Test 2!!!");
    }
}
