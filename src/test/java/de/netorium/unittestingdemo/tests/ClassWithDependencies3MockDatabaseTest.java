package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.ClassWithDependencies3;
import de.netorium.unittestingdemo.DatabaseLayer;
import de.netorium.unittestingdemo.Logger;
import static org.junit.Assert.*;
import org.junit.Test;

public class ClassWithDependencies3MockDatabaseTest {

    private static class TestableClassWithDependencies3 extends ClassWithDependencies3 {

        public MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();

        @Override
        protected Logger getLogger() {
            return new FakeLogger();
        }

        @Override
        protected DatabaseLayer getDatabase() {
            return mockDatabaseLayer;
        }
    }

    @Test
    public void DbAccess_WritingToDatabase_DatabaseLayerWriteWasCalledCorrectlly() {

        //Arrange
        TestableClassWithDependencies3 sut = new TestableClassWithDependencies3();

        //Act
        sut.DoSomething();

        //Assert
        //Did the sut call the DatabaseLayer.write() method?
        assertEquals("Database text", sut.mockDatabaseLayer.read());
    }
}
