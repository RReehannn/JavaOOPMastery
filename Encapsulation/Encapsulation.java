package Encapsulation;

//Encapsulation in java is a process of wrapping code and data together into a single unit,


class Rehan{
    private String name;
    private int age;
    private String email;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}







public class Encapsulation {
    public static void main(String[] args) {
        //object Creation
        Rehan rehan = new Rehan();
        rehan.setName("RReehannn");
        rehan.setAge(24);
        rehan.setEmail("Rehanshakeel786@gmail.com");

        System.out.println(rehan.getName());
        System.out.println(rehan.getAge());
        System.out.println(rehan.getEmail());

        // Output
        // RReehannn
        // 24
        //Rehanshakeel786@gmail.com


    }
}

//By providing only setter or getter method, you can make the class read-only or write-only.