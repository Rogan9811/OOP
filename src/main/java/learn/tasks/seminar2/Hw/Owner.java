package learn.tasks.seminar2.Hw;

import java.util.Random;

public class Owner {
    Random random = new Random();
    String name;
    int age;

    public Owner(String name, int age){
        if(name.isEmpty()){
            throw new RuntimeException();
        }else{
            this.name = name;
        }
        if (age >5) {
            this.age = age;
        } else{
            throw new RuntimeException();
        }
    }
    public Owner(String name){
        this(name, 24);
    }
    public Owner(){
        this("Galina", 60);
    }

    public boolean checkCats(Cat[] cats){
        for (Cat cat : cats){
            if(!cat.getFull()){
                return false;
            }
        }
        return true;
    }
    public void makeFood (Plate plate, boolean solution){
        if(!solution){
            plate.setFood(plate.getFood()+random.nextInt(5, 25));
        }
    }

}
