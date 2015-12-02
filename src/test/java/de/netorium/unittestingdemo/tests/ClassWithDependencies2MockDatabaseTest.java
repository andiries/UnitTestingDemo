package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.ClassWithDependencies2;
import de.netorium.unittestingdemo.DatabaseLayer;
import static org.junit.Assert.*;
import org.junit.Test;

public class ClassWithDependencies2MockDatabaseTest {
    
    @Test
    public void DbAccess_WritingToDatabase_DatabaseLayerWriteWasCalledCorrectlly() {
        
        //Arrange
        DatabaseLayer dbLayerMock = new MockDatabaseLayer();
        ClassWithDependencies2 sut = new ClassWithDependencies2();
        sut.setLogger(new FakeLogger());
        sut.setDatabase(dbLayerMock);
        
        //Act
        sut.DoSomething();
        
        //Assert
        //Did the sut call the DatabaseLayer.write() method?
        assertEquals("Database text", dbLayerMock.read());   
    }
}
