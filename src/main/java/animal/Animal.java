package animal;

public abstract class  Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    protected Animal() {
    }


    protected abstract void eat();

    protected void walk(){
        System.out.println("The animal walks on " + legs + " legs");
    }
}
