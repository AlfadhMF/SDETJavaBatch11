package Practice;

public abstract class Implimentaion {
    abstract void m1();
    abstract void m2();

}
class Child extends Implimentaion{
    @Override
    void m1(){
        System.out.println("Hello");
    }

    @Override
    void m2() {
        System.out.println("Greetings");
    }
    public static void main(String [] args){
        Child child=new Child();
        child.m1();
        child.m2();
    }
}