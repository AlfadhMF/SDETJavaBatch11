package Practice;

public abstract class Abstraction {
    void m1(){
        System.out.println("m1 without parameters");
    }
    void m1(int number){
        System.out.println("m1 method with parameter");
    }
    static class ABS extends Abstraction{

    }
    public static void main(String [] args){
        ABS abs=new ABS();
        abs.m1();
        abs.m1(23);

    }
}
