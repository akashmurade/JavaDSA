public class InterfaceExp {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatGrass();
        b.eatFlesh();
    }
}

interface Herbivore {
    void eatGrass();
}

interface Carnivore {
    void eatFlesh();
}

class Bear implements Herbivore, Carnivore {

    public void eatGrass() {
        System.out.println("Eating Grass");
    }

    public void eatFlesh() {
        System.out.println("Eating Flesh");
    }

}
