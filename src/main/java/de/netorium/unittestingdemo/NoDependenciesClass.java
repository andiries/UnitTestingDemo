package de.netorium.unittestingdemo;

public class NoDependenciesClass {
    public Integer Add(Integer a, Integer b)
    {
        return a + b;
    }
    
    public double Divide(Integer a, Integer b)
    {
        if (0 == b)
            throw new RuntimeException("Damn it! I can't devide by zero");
        
        return a / b;
    }
}
