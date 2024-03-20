package Constructors;

//Parameterized Constructor: constructor with have parameters.
//Default Constructor: Constructor doesn't have any parameters


class students {
    int id;
    int age;


    students(int id, int age) {
        this.id = id;
        this.age = age;
        System.out.println("Parametrize Constructor");
    }
    students(){
        System.out.println("Default Constructor");
    }
}



class TypeOfConstructor {
    public static void main(String[] args) {
        students std1 = new students();
        students std2 = new students(5,10);

//        Output/Results
//        Default Constructor
//        Parametrize Constructor


    }
}


