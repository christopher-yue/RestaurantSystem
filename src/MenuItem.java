public class MenuItem {
    private int itemNumber;
    private String description;
    private double cost;

    // constructor
    public MenuItem(int itemNumber, String description, double cost) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.cost = cost;
    }

    // Get menu item number
    public int getItemNumber() {
        return itemNumber;
    }

    // Get menu item description
    public String getDescription() {
        return description;
    }

    // Get menu item cost
    public double getCost () {
        return cost;
    }
}
