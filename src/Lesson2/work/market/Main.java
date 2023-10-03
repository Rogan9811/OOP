package Lesson2.work.market;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.setName("Oleg");
//
//        human.setMakeOrder();
//        human.setTakeOrder();
//
//        System.out.println(human);

//        System.out.println("--".repeat(10));
//        Human actor = new Human();
//        actor.setName("Oleg");
//        System.out.println(actor);
//        Actor actor = new ;
//        actor1.setName("Oleg");
//        System.out.println(actor);


        Market market = new Market();

        Actor act1 = new Human();
        Actor act2 = new Human();

        act1.setName("Valera gde dengi");
        act2.setName("Ne valera");

        market.acceptToMarket(act1);

        market.acceptToMarket(act2);

        market.takeInQueue(act1);
        market.takeOrders("Brauni");

        market.takeInQueue(act2);
        market.takeOrders("Valeru pzh");

        market.update();
        market.update();

        market.releaseFromMarket(act1);
        market.releaseFromMarket(act2);
    }
}
