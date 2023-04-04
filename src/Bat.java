public class Bat extends Mammalia implements FlyAbility {
    @Override
    public void fly() {
        System.out.println("Bat can fly");

    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Bat says - I'm a Bat");
    }

    @Override
    void eat(Food food) {
        super.eat(food);
        System.out.println(food.name);
    }
}
