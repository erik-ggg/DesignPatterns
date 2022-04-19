package strategy.strategies;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute() {
        System.out.println("WalkingStrategy");
    }
}
