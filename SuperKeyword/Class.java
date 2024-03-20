package SuperKeyword;

// To invoke parent class method

class AAnimal{
    void eat(){
        System.out.println("Parent class eating.....");
    }
}

class DDog extends AAnimal{
    void eat(){
        System.out.println("Eating bread.....");
    }
    void work(){
        super.eat(); // Parent class eat invoke
        eat(); // Child class eat run
    }
}

public class Class {
    public static void main(String[] args) {
        DDog dog = new DDog();
        dog.work();
    }

    // Output
    // Parent class eating.....
    // Eating bread.....

}
