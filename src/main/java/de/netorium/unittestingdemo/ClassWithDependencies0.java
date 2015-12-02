package de.netorium.unittestingdemo;

public class ClassWithDependencies0 {
    private final LoggerImplementation logger = new LoggerImplementation();
    private final DatabaseLayerImplementation database = new DatabaseLayerImplementation();
    
    public void DoSomething()
    {
        logger.info(null);
        database.write("Database text");
    }
}
