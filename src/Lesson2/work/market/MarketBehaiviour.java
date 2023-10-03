package Lesson2.work.market;

import java.util.List;

public interface MarketBehaiviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actor);
    void update();
}
