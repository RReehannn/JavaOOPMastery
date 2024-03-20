package Inheritance;

// Inheritance is a mechanism in which one object acquires all the properties and behaviors of parent object.


class vehicle{
    double price = 10000;
    double mileage= 60;
    String color= "Black";



}

class car extends vehicle{
    String fuleType = "Petrol";
    String brand = "Maruti";
    int ID = 786;
    boolean sunRoof;


}


public class Inheritance {
    public static void main(String[] args) {
        car Car = new car();
        System.out.println(Car.mileage);
        System.out.println(Car.price);
        System.out.println(Car.color);
        System.out.println(Car.fuleType);
        System.out.println(Car.ID);

        //Output :-
        // 60.0
        //10000.0
        //Black
        //Petrol
        //786
    }
}

//Syntax of Java Inheritance:- class Subclass-name extends Superclass-name