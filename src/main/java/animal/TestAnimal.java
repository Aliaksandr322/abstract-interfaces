package animal;

public class TestAnimal {
    public static void main(String[] args) {
        Spider spider = new Spider();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Cat cat1 = new Cat("Barsic");
        Fish fish1 = new Fish("Fluffy");


        System.out.println("\nFirst eat \n");
        spider.eat();
        cat.eat();
        cat1.eat();
        fish.eat();
        fish1.eat();

        System.out.println("\nFirst play \n");
        cat.play();
        cat1.play();
        fish.play();
        fish1.play();

        System.out.println("\nRenamed\n");
        System.out.println("Rename cat : ");
        cat.setName();
        System.out.println("Rename fish : ");
        fish.setName();

        System.out.println("\nSecond eat \n");
        spider.eat();
        cat.eat();
        cat1.eat();
        fish.eat();
        fish1.eat();

        System.out.println("\nSecond play \n");
        cat.play();
        cat1.play();
        fish.play();
        fish1.play();

        System.out.println("\nWalk \n");
        fish.walk();
        cat.walk();
        spider.walk();
    }
}
