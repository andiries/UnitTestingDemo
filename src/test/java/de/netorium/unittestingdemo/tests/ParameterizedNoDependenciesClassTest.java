package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.NoDependenciesClass;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedNoDependenciesClassTest {
    
    public Object[]parametersForCalculations_AddTwoNumbers_ResultIsSum() {
        return JUnitParamsRunner.$(
                JUnitParamsRunner.$(1, 2, 3),
                JUnitParamsRunner.$(-4, 2, -2),
                JUnitParamsRunner.$(0, 0, 0),
                JUnitParamsRunner.$(-3, -7, -10),
                JUnitParamsRunner.$(257, 11, 268)
        );
    }
    
    @Test
    @Parameters
    public void calculations_AddTwoNumbers_ResultIsSum(Integer a, Integer b, Integer expected)
    {
        //Arrange
        NoDependenciesClass sut = new NoDependenciesClass();
       
        //Act
        Integer result = sut.Add(a, b);
        
        //Assert
        assertEquals(expected, result); 
    }
}
