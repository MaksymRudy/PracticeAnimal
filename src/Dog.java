public class Dog extends Mammalia implements WalkAbility,SwimAbility{
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Dog says - I'm a Dog");
    }

    @Override
    void eat(Food food) {
        super.eat(food);
        System.out.println(food.name);
    }

    @Override
    public void swim() {
        System.out.println("Dog can swim");

    }

    @Override
    public void walk() {
        System.out.println("Dog can walk");

    }
}
