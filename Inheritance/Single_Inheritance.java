package Inheritance;

class employee{
void salary(){
    System.out.println("Salary = 70000");
}
}

class hr extends employee{
    void bonus(){
        System.out.println("Bonus = 20000");
    }

}


public class Single_Inheritance {
    public static void main(String[] args) {
        hr h = new hr();
        h.bonus();
        h.salary();
    }
}
