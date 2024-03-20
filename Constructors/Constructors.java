package Constructors;

// In JAVA, Constructor is a special type of method that is called when an object of a class is created.
// In Constructor class name and method name is same.
class student {
    int id;
    int age;


    student(int id, int age) {
        this.id = id;
        this.age = age;
        System.out.println("Hello Rehan");
    }
}



class Constructors {
    public static void main(String[] args) {
        student std = new student(10,12);

        //output----Hello Rehan
        // Constructor is automatically along with class object
    }
}
