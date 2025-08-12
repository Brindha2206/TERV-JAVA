package day18;

class hai{
    void college(){
        System.out.println("AIDS");
    }
}

public class runTimePolymorphism extends hai{
    void college(){
        System.out.println("CSE");
    }
    public static void main(String[] args) {
        runTimePolymorphism o = new runTimePolymorphism();
        o.college();
    }
}
