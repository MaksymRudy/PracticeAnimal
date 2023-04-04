public class Whale extends Mammalia implements SwimAbility{

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Whale says - I'm a Whale");
    }

    @Override
    void eat(Food food) {
        super.eat(food);
        System.out.println(food.name);
    }

    @Override
    public void swim() {
        System.out.println("Whale swims");

    }
}
