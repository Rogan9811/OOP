package Lesson2.work.market;

import java.util.*;

public class Market implements QueueBehaiviour, MarketBehaiviour {
    Queue orders = new LinkedList();
    Queue que = new LinkedList();
    List toMarket = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        toMarket.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        toMarket.remove(actor);
    }

    @Override
    public void update() {
        if(!orders.isEmpty()){
            System.out.println("--".repeat(10) + "\n");
            System.out.println("New order "+ orders.element() + " for " + que.element() + " is initialized." );
            giveOrders();
            releaseFromQueue();
            System.out.println("--".repeat(10) + "\n");
            System.out.println("Orders - " + orders.size());
            System.out.println("People - " + toMarket.size());
            System.out.println("--".repeat(10) + "\n");
        }
        else {
            System.out.println("Orders is none.");
            System.out.println("People - " + toMarket.size() + "\n");
        }
    }

    @Override
    public void takeInQueue(Actor actor) {
        que.add(actor);
    }

    @Override
    public void takeOrders(String order) {
        orders.add(order);
    }

    @Override
    public void giveOrders() {
        orders.remove();
    }

    @Override
    public void releaseFromQueue() {
        que.remove();
    }

}
