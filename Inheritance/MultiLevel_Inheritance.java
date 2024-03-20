package Inheritance;

class AA{
    public void methodAA(){
        System.out.println("Method of AA class");
    }
}
class BB extends AA{
    public void methodBB(){
        System.out.println("Method of BB class");
    }
}
class CC extends BB{
    public void methodCC(){
        System.out.println("Method of CC class");
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        CC obj = new CC();
        obj.methodAA();
        obj.methodBB();
        obj.methodCC();

        //Output:-
        // Method of AA class
        //Method of BB class
        //Method of CC class
    }

}
