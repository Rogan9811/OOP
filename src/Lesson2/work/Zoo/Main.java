package Lesson2.work.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal frog = new Frog();
        Animal capibara = new Capibara();
        frog.voice();;
        capibara.voice();
        System.out.println("--".repeat(10));
        frog.setName("Kvakushka");
        capibara.setName("Capy");
        System.out.println("--".repeat(10));
        System.out.println(frog.getName());
        System.out.println(capibara.getName());
        System.out.println("--".repeat(10));
        capibara.clean();
        capibara.feed();
        System.out.println("--".repeat(10));
        frog.clean();
        frog.feed();
        System.out.println("--".repeat(10));
        frog.info();
        capibara.info();
    }
}
