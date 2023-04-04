public class Parrot extends Bird implements FlyAbility, WalkAbility {

    @Override
    void makeSound() {
        System.out.println("Parrot says - I'm a Parrot");
    }

    @Override
    void eat(Food food) {
        System.out.println(food.name);
    }

    @Override
    public void fly() {
        System.out.println("Parrot can fly");

    }

    @Override
    public void walk() {
        System.out.println("Parrot can walk");

    }
}
