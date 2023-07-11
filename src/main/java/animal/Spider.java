package animal;

public class Spider extends Animal{

    protected Spider() {
        super.legs = 8;
    }

    @Override
    protected void eat() {
        System.out.println("Spider is eating...");
    }
}