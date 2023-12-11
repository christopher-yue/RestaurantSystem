public class Aggregator {
    private final Menu menu;
    private final Orders orders;
    private final Tab tab;
    private static Aggregator aggregatorInstance;

    // Constructor
    private Aggregator() {
        menu = new Menu();
        orders = new Orders();
        tab = new Tab(orders, menu);
    }

    // Singleton
    public static Aggregator getAggregatorInstance() {
        if (null == aggregatorInstance) {
            aggregatorInstance = new Aggregator();
        }
        return aggregatorInstance;
    }

    // Get menu
    public Menu getMenu() {
        return menu;
    }

    // Get orders
    public Orders getOrders() {
        return orders;
    }

    // Get tab
    public Tab getTab() { return tab; }
}
