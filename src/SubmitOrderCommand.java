public class SubmitOrderCommand implements Command {
    private Aggregator aggregator;
    private int itemNumber;

    // constructor
    public SubmitOrderCommand(Aggregator aggregator, int itemNumber) {
        this.aggregator = aggregator;
        this.itemNumber = itemNumber;
    }

    @Override
    public String execute() {
        aggregator.getOrders().addOrderItem(new OrderItem(itemNumber));
        return "Order submitted\n";
    }
}
