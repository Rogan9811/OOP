package Lesson2.work.Zoo;

public class Frog extends Animal{
    @Override
    public void info() {
        System.out.println("It's green");
    }

    @Override
    public void feed() {
        System.out.println("frog has been feeded");
    }

    @Override
    public void clean() {
        System.out.println("frog has been cleaned");
    }

    @Override
    void voice() {
        System.out.println("kva");
    }
}
