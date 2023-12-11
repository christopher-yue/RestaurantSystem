public class Tab {
    private final Orders orders;
    private final Menu menu;

    // Constructor
    public Tab(Orders orders, Menu menu) {
        this.orders = orders;
        this.menu = menu;
    }

    // Get tab
    public String getTab() {
        double totalCost = 0;
        String items = "";
        for(OrderItem item : orders.getOrderItems()) {
            totalCost += menu.getOneMenuItem(item.getItemNumber()).getCost();
            items += item.getItemNumber() + ". " +  menu.getOneMenuItem(item.getItemNumber()).getDescription() + " | " + menu.getOneMenuItem(item.getItemNumber()).getCost() + "\n";
        }
        return(items + "Total: " + totalCost);
    }
}
