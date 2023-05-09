package learn.tasks.lections;

class Doo extends foo {
    public void M(){
        foo.count =123;
    }
}
public class foo {
    public Integer value;

    protected static Integer count;

    public static Integer getCount() {
        return count;
    }

    static {
        count = 0;
    }

    public foo(){
        count++;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
