package de.netorium.unittestingdemo;

public class LoggerImplementation implements Logger {
    @Override
    public void info(String message)
    {
        System.out.println(message);
    }
    @Override
    public void error(String message)
    {
        System.err.println(message);
    }
}
