package Lesson2.work.market;

public interface QueueBehaiviour {
    void takeInQueue(Actor actor);
    void takeOrders(String order);
    void giveOrders();
    void releaseFromQueue();
}
