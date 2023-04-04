public class Penguin extends Bird implements SwimAbility, WalkAbility {

    @Override
    void makeSound(){
        System.out.println("Penguin says - I'm a Penguin");
    }

    @Override
    void eat(Food food) {
        System.out.println(food.name);
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");

    }

    @Override
    public void walk() {
        System.out.println("Penguin can walk");

    }
}
