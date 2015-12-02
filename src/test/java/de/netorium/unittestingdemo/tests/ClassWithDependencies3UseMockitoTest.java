package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.ClassWithDependencies3;
import de.netorium.unittestingdemo.DatabaseLayer;
import de.netorium.unittestingdemo.Logger;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class ClassWithDependencies3UseMockitoTest {

    private static class TestableClassWithDependencies3 extends ClassWithDependencies3 {

        public DatabaseLayer mockDatabaseLayer = mock(DatabaseLayer.class);

        @Override
        protected Logger getLogger() {
            return mock(Logger.class);
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
        //Did the sut call the DatabaseLayer.write() method exactly once?
        verify(sut.mockDatabaseLayer, times(1)).write("Database text");
    }
}
