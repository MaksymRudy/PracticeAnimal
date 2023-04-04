public class Main {
    public static void main(String[] args) {

        Penguin penguin = new Penguin();
        penguin.makeSound();
        penguin.move();
        Food worm = new Worm();
        penguin.eat(worm);
        penguin.swim();
        penguin.walk();

        Parrot parrot = new Parrot();
        parrot.makeSound();
        parrot.move();
        parrot.fly();
        parrot.walk();
        Food grain = new Food();
        parrot.eat(grain);

        Salmon salmon = new Salmon();
        salmon.makeSound();
        salmon.move();
        salmon.swim();
        salmon.eat(new Worm());

        Exocoetidae exocoetidae = new Exocoetidae();
        exocoetidae.makeSound();
        exocoetidae.move();
        exocoetidae.swim();
        exocoetidae.fly();

        Dog dog = new Dog();
        dog.makeSound();
        dog.move();
        dog.swim();
        dog.walk();

        Bat bat = new Bat();
        bat.makeSound();
        bat.move();
        bat.fly();
    }
}