package Abstraction;

//Abstraction is a process of hiding the implementation details and showing only functionality to the user.

abstract class Bike{
    abstract public void fuelType();

}

class palatina extends Bike{
    @Override
    public void fuelType() {
        System.out.println("Petrol");
    }
}




 public class Abstraction {
    public static void main(String[] args) {
        //Object of Abstract class never be formed
         palatina Palatina = new palatina();
         Palatina.fuelType();

         //Output- Petrol

    }
}


//There are two ways to achieve abstraction in java
//1.Abstract class
//2.Interface