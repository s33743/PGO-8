public record ServiceOrder(String clientName,
                           int hours,
                           double hourRate
) {
}
@FunctionalInterface
interface PriceStrategy {
    double calculate(ServiceOrder order);
}
class PriceCalculator {
    double calculate(ServiceOrder order, PriceStrategy strategy) {
        return strategy.calculate(order);
    }
}

