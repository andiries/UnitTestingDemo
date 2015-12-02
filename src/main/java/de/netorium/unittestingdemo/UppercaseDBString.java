package de.netorium.unittestingdemo;

public class UppercaseDBString {
   public String getUppercaseDBString()
   {
       return getDatabase().read().toUpperCase();
   }
   
   private DatabaseLayer database = null;
   
   protected DatabaseLayer getDatabase() {
        if (null == database)
            database = new DatabaseLayerImplementation();
        return database;
    }
}
