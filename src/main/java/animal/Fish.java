package animal;

import java.util.Scanner;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish(String name) {
        this.name = name;
        super.legs = 0;
    }
    public Fish(){
        this("noName");
    }

    @Override
    protected void eat() {
        System.out.println("Fish named " + getName() + " is eating...");
    }

    @Override
    public void play() {
        System.out.println("Fish is named " + getName() +  " playing...");
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
    @Override
    protected void walk() {
        System.out.println("Fish isn't walk becouse it's have " + legs + " legs");
    }
}