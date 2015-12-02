package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.DatabaseLayer;
import de.netorium.unittestingdemo.UppercaseDBString;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UppercaseDBStringTest {
    
    private static class TestableUppercaseDBString extends UppercaseDBString {

        public DatabaseLayer mockDatabaseLayer = mock(DatabaseLayer.class);

        @Override
        protected DatabaseLayer getDatabase() {
            return mockDatabaseLayer;
        }
    }

    @Test
    public void Uppercase_GetDBString_ReturnedStringIsUppercase() {
        
        //Arrange
        TestableUppercaseDBString sut = new TestableUppercaseDBString();
        
        String text = "My Text from Database";
        
        when(sut.mockDatabaseLayer.read()).thenReturn(text);
        
        //Act
        String result = sut.getUppercaseDBString();

        //Assert
        //Did getUppercaseDBString() do it's job?
        assertEquals(text.toUpperCase(), result);
    }
}
