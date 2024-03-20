package Inheritance;

//Java does not support multiple inheritance This is because this can lead to the diamond problem.
//where conflicts arise when two superclasses of a class have a method with the same name and signature.
//Java supports multiple inheritance through interfaces


interface AAA{
    public void run();
}

interface BBB{
    public void run();
}

class CCC implements AAA, BBB{
    @Override
    public void run() {
        System.out.println("C class run method");

    }
}
public class Multiple_InheritanceAchieve {
    public static void main(String[] args) {
        CCC ccc = new CCC();
        ccc.run();

        //Output:- C class run method
    }
}
