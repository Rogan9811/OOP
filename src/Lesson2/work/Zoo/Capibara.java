package Lesson2.work.Zoo;

public class Capibara extends Animal{
    @Override
    public void info() {
        System.out.println("It's so cute");
    }

    @Override
    public void feed() {
        System.out.println("capibara has been feeded");
    }

    @Override
    public void clean() {
        System.out.println("capibara has been cleaned");
    }

    @Override
    void voice() {
        System.out.println("capibara noises");
    }
}
