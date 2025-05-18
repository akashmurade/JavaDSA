public class OOPS {
    public static void main(String[] args) {
        // Pen p = new Pen();
        // p.setColor("blue");
        // p.setTip(5);
        // System.out.println(p.getColor());
        // System.out.println(p.getTip());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "some";
        // myAcc.setPassword("some");

        Student s1 = new Student("The", 321, "secret");
        s1.printInfo();
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

class BankAccount {
    String username;
    private String password;

    void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    String getColor() {
        return color;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    int getTip() {
        return tip;
    }
}

class Student {
    String name;
    int roll;
    String password;

    Student(String name, int roll, String password) {
        this.name = name;
        this.roll = roll;
        this.password = password;
    }

    Student(Student s) {
        name = s.name;
        roll = s.roll;
        password = s.password;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll);
        System.out.println("Password: " + password);
    }
}