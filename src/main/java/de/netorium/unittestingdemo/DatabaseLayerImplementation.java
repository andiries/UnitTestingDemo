package de.netorium.unittestingdemo;

public class DatabaseLayerImplementation implements DatabaseLayer{

    @Override
    public String read() {
        System.out.println("DatabaseLayerImplementation.read()");
        return "";
    }

    @Override
    public void write(String text) {
        System.out.println("DatabaseLayerImplementation.write(String)");
    }
}
