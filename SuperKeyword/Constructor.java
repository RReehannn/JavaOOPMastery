package SuperKeyword;

// To invoke parent class constructor

class AAAnimal{
    AAAnimal(){
        System.out.println("Animal is created");
    }
}
class DDDog extends AAAnimal{
    DDDog(){
        super();
        System.out.println("D0g is created");
    }
}

public class Constructor {
    public static void main(String[] args) {
        DDDog dog = new DDDog();
    }

    // output
    // Animal is created
    // D0g is created

}
