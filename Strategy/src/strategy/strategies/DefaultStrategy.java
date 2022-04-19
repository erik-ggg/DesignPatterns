package strategy.strategies;

public class DefaultStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Default route");
    }
}
