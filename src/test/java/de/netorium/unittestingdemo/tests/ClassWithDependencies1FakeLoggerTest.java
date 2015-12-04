package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.ClassWithDependencies1;
import de.netorium.unittestingdemo.DatabaseLayerImplementation;
import static org.junit.Assert.*;
import org.junit.Test;

public class ClassWithDependencies1FakeLoggerTest {
    
    @Test
    public void DbAccess_LoggingFake_WorksLikeACharm() {
        
        //Arrange
        ClassWithDependencies1 sut = new ClassWithDependencies1(new FakeLogger(), 
            new DatabaseLayerImplementation());
        //Act
        sut.DoSomething();
        
        //Assert
        assertTrue(true);
    }   
}
