package Polymorphism;

// If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java.
// Method overriding is runtime polymorphism


class Bank{
    public void RateOfInterest(){
        System.out.println("Generally Rate of Interest Of BANK 5%");

    }
}
class SBI extends Bank{
    public void RateOfInterest(){
        System.out.println("Rate of Interest Of SBI is 4%");
    }
}
class PNB extends Bank {
    public void RateOfInterest() {
        System.out.println("Rate of Interest of PNB IS 6%");

    }
}


class MethodOverriding {
    public static void main(String[] args) {

        //RunTime Polymorphism
        Bank object1 = new Bank();
        SBI object2 = new SBI();
        PNB object3 = new PNB();
        object2.RateOfInterest();
        object3.RateOfInterest();
        object1.RateOfInterest();

    }

}
//Rules for Java Method Overriding
//1.method must have same name as in the parent class
//1.method must have same parameter as in the parent class.

