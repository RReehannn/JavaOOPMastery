package SuperKeyword;

//To invoke parent class variable
class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color= "Black";
    void printColor(){
        System.out.println(color); //Prints color of Dog class
        System.out.println(super.color); //Prints color of Animal class
    }
}

public class Variable {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();

        // Result
        // Black
        //White

    }

}
