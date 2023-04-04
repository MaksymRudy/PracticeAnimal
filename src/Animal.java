public abstract class Animal {

    abstract void makeSound();

    abstract void eat(Food food);

    void move() {
        System.out.println("Animal moved");
    }
}
