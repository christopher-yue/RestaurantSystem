import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<MenuItem> menuItems = new ArrayList<>();

    // Get all menu items
    public List<MenuItem> getAllMenuItems() {
        return menuItems;
    }

    // Get specific menu item
    public MenuItem getOneMenuItem(int itemNumber) {
        for(MenuItem item : menuItems) {
            if(item.getItemNumber() == itemNumber)
                return item;
        }
        return null;
    }

    // Add menu item
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }
}
