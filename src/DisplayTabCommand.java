public class DisplayTabCommand implements Command {
    private Aggregator aggregator;

    // constructor
    public DisplayTabCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public String execute() {
        return aggregator.getTab().getTab() + "\n";
    }
}
