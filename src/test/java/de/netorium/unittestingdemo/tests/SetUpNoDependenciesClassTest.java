package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.NoDependenciesClass;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetUpNoDependenciesClassTest {
  
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
    @Before
    public void setUp() {
        File file = new File("testfile.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(SetUpNoDependenciesClassTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @After
    public void tearDown() {
        File file = new File("testfile.txt");
        file.delete();
    }

    @Test
    public void calculations_AddTwoNumbers_ResultIsSum()
    {
        //Arrange
        NoDependenciesClass sut = new NoDependenciesClass();
        Integer a = 7;
        Integer b = 4;
        Integer expected = 11;
        
        //Act
        Integer result = sut.Add(a, b);
        String text = String.format("%s + %s = %s", a, b, result);
        
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("testfile.txt", true));
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException ex) {
            Logger.getLogger(SetUpNoDependenciesClassTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                bufferedWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(SetUpNoDependenciesClassTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Assert
        assertEquals(expected, result); 
    }
}
