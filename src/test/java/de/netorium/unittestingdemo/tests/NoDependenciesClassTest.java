package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.NoDependenciesClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NoDependenciesClassTest {

    @Test
    //Test names:UnitOfWorkName_ScenarioUnderTest_ExpectedBehaviour 
    public void calculations_AddThreeAndFive_ResultIsEight()
    {
        //Arrange
        NoDependenciesClass sut = new NoDependenciesClass();
        Integer param1 = 3;
        Integer param2 = 5;
        
        Integer expected = 8;
        
        //Act
        Integer result = sut.Add(param1, param2);
        
        //Assert
        //Immer nur ein Assert
        assertEquals(expected, result); 
    }

    @Test
    public void calculations_DivideByZero_TrowsException() {
        
        //Arrange
        NoDependenciesClass sut = new NoDependenciesClass();
        Integer param1 = 3;
        Integer param2 = 0;
        
        Boolean exceptionThrown = false;
        
        //Act
        try {
            sut.Divide(param1, param2);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        
        //Assert
        assertEquals(true, exceptionThrown);
    }
}
