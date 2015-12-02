package de.netorium.unittestingdemo;

public interface DatabaseLayer {
    public String read();
    public void write(String text);
}
