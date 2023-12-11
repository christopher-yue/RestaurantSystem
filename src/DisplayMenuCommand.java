public class DisplayMenuCommand implements Command {
    private Aggregator aggregator;

    // constructor
    public DisplayMenuCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public String execute() {
        String menuItems = "";
        for(MenuItem item : aggregator.getMenu().getAllMenuItems()) {
            menuItems += item.getItemNumber() + ". " + item.getDescription() + " | " + item.getCost() + "\n";
        }
        return menuItems;
    }
}
