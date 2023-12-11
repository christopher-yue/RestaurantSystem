public class Table implements TableListener {
    private int tableNumber;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    @Override
    public void alarm() {
        System.out.println("Customers left table " + tableNumber);
    }
}
