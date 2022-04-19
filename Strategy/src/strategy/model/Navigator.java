package strategy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import strategy.strategies.DefaultStrategy;
import strategy.strategies.RouteStrategy;

@Getter
@Setter
@AllArgsConstructor
public class Navigator {

    private RouteStrategy routeStrategy;

    public Navigator() {
        this.routeStrategy = new DefaultStrategy();
    }

    public void executeStrategy() {
        this.routeStrategy.buildRoute();
    }
}
