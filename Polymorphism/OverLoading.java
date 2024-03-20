package Polymorphism;

// When one task is performed in different way is known as Polymorphism

//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
// Method Overloading compile-time

public class OverLoading {

        public static int sum(int a, int b){
            return a+b;
        }
        public static int sum(int a, int b, int c) {
            return a + b + c;
        }

        public static String sum(String x, String y){
            return x+y;
        }


        public static void main(String[] args) {
            //Compile Time Polymorphism
            System.out.println(sum(5,7));
            System.out.println(sum(5,7,5));
            System.out.println(sum("Rehan", "Shakeel"));

        }
    }

//There are two ways to overload the method in java
//1.By changing number of arguments
//2.By changing the data type


