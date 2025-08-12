package day18;
//Compile time polymorphism
public class polymorphism {
    public void add(int x, int y){
        System.out.println(x+y);
    }
    public void add (int x, int y , int z){
        System.out.println(x+y+z);
    }
    public static void main(String[] args) {
        polymorphism o = new polymorphism();
        o.add(5,6);
        o.add(5, 7, 10);
    }
}
