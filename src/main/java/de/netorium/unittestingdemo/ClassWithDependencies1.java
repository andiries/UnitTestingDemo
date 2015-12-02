package de.netorium.unittestingdemo;

public class ClassWithDependencies1 {
    private final Logger logger;
    private final DatabaseLayer database;

    public ClassWithDependencies1(Logger logger, DatabaseLayer database) {
        this.logger = logger;
        this.database = database;
    }
    
    public void DoSomething()
    {
        logger.info("In DoSomething()");
        database.write("Database text");
    }
}
