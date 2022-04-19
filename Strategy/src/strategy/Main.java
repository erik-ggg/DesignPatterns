package strategy;

import strategy.model.Navigator;
import strategy.strategies.RoadStrategy;
import strategy.strategies.WalkingStrategy;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.executeStrategy();
        navigator.setRouteStrategy(new RoadStrategy());
        navigator.executeStrategy();
        navigator.setRouteStrategy(new WalkingStrategy());
        navigator.executeStrategy();
    }
}
