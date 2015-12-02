package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.ClassWithDependencies1;
import de.netorium.unittestingdemo.DatabaseLayer;
import static org.junit.Assert.*;
import org.junit.Test;

public class ClassWithDependencies1MockDatabaseTest {
    
    @Test
    public void DbAccess_WritingToDatabase_DatabaseLayerWriteWasCalledCorrectlly() {
        
        //Arrange
        DatabaseLayer dbLayerMock = new MockDatabaseLayer();
        ClassWithDependencies1 sut = new ClassWithDependencies1(new FakeLogger(), 
            dbLayerMock);
        
        //Act
        sut.DoSomething();
        
        //Assert
        //Did the sut call the DatabaseLayer.write() method?
        assertEquals("Database text", dbLayerMock.read());   
    }
}
