public class Invoker {
    private final Aggregator aggregator;

    // constructor
    public Invoker(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    // Get menu command call
    public String displayMenu() {
        DisplayMenuCommand displayMenu = new DisplayMenuCommand(aggregator);
        return displayMenu.execute();
    }

    // Submit order command call
    public String submitOrder(int itemNumber) {
        SubmitOrderCommand submitOrder =  new SubmitOrderCommand(aggregator, itemNumber);
        return submitOrder.execute();
    }

    // Get tab command call
    public String displayTab() {
        DisplayTabCommand displayTab = new DisplayTabCommand(aggregator);
        return displayTab.execute();
    }
}
