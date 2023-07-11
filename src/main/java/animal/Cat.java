package animal;

import java.util.Scanner;

public class Cat extends Animal implements Pet{
    private String name;
    public Cat(String name) {
        this.name = name;
        super.legs = 4;
    }

    public Cat(){
        this("noName");
    }




    @Override
    protected void eat() {
        System.out.println("Cat named " + getName() + " is eating...");
    }

    @Override
    public void play() {
        System.out.println("The cat named " + getName() + " is playing");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName() {
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.next();
        this.name = newName;
    }
}