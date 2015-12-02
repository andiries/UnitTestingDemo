package de.netorium.unittestingdemo;

public class ClassWithDependencies3 {
    private Logger logger = null;
    private DatabaseLayer database = null;

    protected Logger getLogger() {
        if (null == logger)
            logger = new LoggerImplementation();
        return logger;
    }

    protected DatabaseLayer getDatabase() {
        if (null == database)
            database = new DatabaseLayerImplementation();
        return database;
    }
     
    public void DoSomething()
    {
        getLogger().info("In DoSomething()");
        getDatabase().write("Database text");
    }
}
