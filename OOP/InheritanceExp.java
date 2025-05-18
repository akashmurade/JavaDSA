public class InheritanceExp {
    public static void main(String[] args) {
        Tuna t = new Tuna();
        t.eat();
        t.sleep();
        t.swim();
        t.speedSwim();

        Human h = new Human();
        h.eat();
        h.speak();

    }
}

class Animal {
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Fish extends Animal {
    public void swim() {
        System.out.println("Swimming");
    }
}

class Tuna extends Fish {
    public void speedSwim() {
        System.out.println("Swims fast");
    }
}

class Shark extends Fish {
    public void hunt() {
        System.out.println("Hunts other fishes");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("Fly");
    }
}

class Peacock extends Bird {
    public void displayFeathers() {
        System.out.println("F e a t h e r s");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("Walk");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Barks");
    }
}

class Cat extends Mammal {
    public void meow() {
        System.out.println("Meows");
    }
}

class Human extends Mammal {
    public void speak() {
        System.out.println("Speaking");
    }
}