package Lesson2.work.Zoo;


public abstract class Animal implements Zoo, Behaivor{
    protected String name;
    abstract void voice();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
