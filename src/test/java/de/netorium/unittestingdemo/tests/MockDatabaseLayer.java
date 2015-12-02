/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.netorium.unittestingdemo.tests;

import de.netorium.unittestingdemo.DatabaseLayer;
import javafx.scene.text.Text;

/**
 *
 * @author riesa
 */
public class MockDatabaseLayer implements DatabaseLayer{

    String text;
    
    @Override
    public String read() {
        return text;
    }

    @Override
    public void write(String text) {
        this.text = text;
    }
}
