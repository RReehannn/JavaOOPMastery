package Interface;
//The interface in java is a mechanism to achieve abstraction.
//There can be only abstract methods in the java interface not method body.


interface Animal{
    public void eat();
}

class Lion implements Animal{
    @Override
    public void eat() {
        System.out.println("Lion is Eating");

    }
}

class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("Tiger is Eating");
    }
}



public class Interface {
    public static void main(String[] args) {
        // Object of Interface class never be created
        // Generally Interface are used to achieve multiple INHERITANCE and ABSTRACTION
        Animal lion = new Lion();
        lion.eat();
        Animal tiger = new Tiger();
        tiger.eat();

        //output:-
        // Lion is Eating
        //Tiger is Eating

    }
}

// Interface is used to achieve abstraction and multiple inheritance in Java.