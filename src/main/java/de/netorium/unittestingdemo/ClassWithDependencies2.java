package de.netorium.unittestingdemo;

public class ClassWithDependencies2 {
    private Logger logger;
    private DatabaseLayer database;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void setDatabase(DatabaseLayer database) {
        this.database = database;
    }
     
    public void DoSomething()
    {
        logger.info("In DoSomething()");
        database.write("Database text");
    }
}
