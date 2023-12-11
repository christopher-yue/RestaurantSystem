import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aggregator aggregator = Aggregator.getAggregatorInstance();
        Invoker invoker = new Invoker(aggregator);
        Table table = new Table(1);
        SensorSystem sensorSystem = new SensorSystem();

        aggregator.getMenu().addMenuItem(new MenuItem(1, "Roast Beef", 20.0));
        aggregator.getMenu().addMenuItem(new MenuItem(2, "Chicken Korma", 15.0));
        aggregator.getMenu().addMenuItem(new MenuItem(3, "Jiaozi", 10.0));

        sensorSystem.register(table);

        int option;

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Display the menu");
            System.out.println("2. Submit an order");
            System.out.println("3. Display your tab");
            System.out.println("4. Pay your tab (exit)");
            System.out.print("\nEnter the integer value associated with your choice: ");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println(invoker.displayMenu());
                    break;
                case 2:
                    System.out.println("What would you like to order?");
                    System.out.print("Enter the integer value associated with your choice: ");
                    option = scanner.nextInt();
                    if(aggregator.getMenu().getOneMenuItem(option) == null) {
                        System.out.println("That menu item does not exist.\nPlease view the menu then try again");
                        System.out.println();
                        break;
                    }
                    System.out.println(invoker.submitOrder(option));
                    break;
                case 3:
                    System.out.println(invoker.displayTab());
                    break;
                case 4:
                    System.out.println("Goodbye, thanks for coming!");
                    sensorSystem.soundTheAlarm();
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
