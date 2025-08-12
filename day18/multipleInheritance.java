package day18;

interface parent1 
{
    void car();
}
interface parent2 
{
    void bike();
}
public class multipleInheritance implements parent1,parent2{
    public void bike()
    {
        System.out.println("ninja");
    }
    public void car()
    {
        System.out.println("volkswagen");
    }
    public static void main (String[] args) 
    {
        multipleInheritance m = new multipleInheritance();
        m.bike();
        m.car();
    }
    
}

