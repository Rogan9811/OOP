package Lesson2.work.market;

public class Human extends Actor {

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public String toString() {
        return String.format("Order is maked " + isMakeOrder + "\n Order is complete " + isTakeOrder);
    }
}
