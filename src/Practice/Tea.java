package Practice;

public abstract class Tea {
    abstract void AddSugar();
}
class Lemon extends Tea{
    @Override
    void AddSugar(){
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
    }
}
class Chai extends Tea{
    @Override
    void AddSugar(){
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
    public static void main(String [] args){
Lemon lemon=new Lemon();
lemon.AddSugar();
Chai chai=new Chai();
chai.AddSugar();
    }
}

