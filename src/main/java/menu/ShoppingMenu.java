package menu;

import java.util.HashMap;
import java.util.Map;

public class ShoppingMenu {

    public static String getMenuOption(String option) throws IllegalArgumentException {
        if(displayMenuOptions().containsKey(option))
        return displayMenuOptions().get(option);
        throw new IllegalArgumentException("Invalid menu option, please select a valid option");
    }

    private static Map<String, String> displayMenuOptions() {
        Map< String, String> menuOptions = new HashMap<>();
        menuOptions.put("1", "1: Create new shopping list");
        menuOptions.put("2", "2: View current shopping list");
        menuOptions.put("3", "3: Add an item to the shopping list");
        menuOptions.put("4", "4: Update an item on the shopping list");
        menuOptions.put("5", "5: Remove item from the shopping list");
        menuOptions.put("6", "6: Mark as complete");
        return menuOptions;
    }

    public static void displayMenu() {
        displayMenuOptions().values().forEach(value -> System.out.println(value));
    }
}

