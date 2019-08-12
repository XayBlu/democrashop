package menu;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingMenuTest {
    private ShoppingMenu shoppingMenu;

    @Before
    public void setUp(){
        shoppingMenu = new ShoppingMenu();
    }

    @Test
    public void should_display_create_shopping_list_option() {
        assertEquals(shoppingMenu.getMenuOption("1"), "1: Create new shopping list");
    }

    @Test
    public void should_display_view_list_option() {
        assertEquals(shoppingMenu.getMenuOption("2"), "2: View current shopping list");
    }

    @Test
    public void should_display_add_an_item_to_the_existing_shopping_list() {
        assertEquals(shoppingMenu.getMenuOption("3"), "3: Add an item to the shopping list");
    }

    @Test
    public void should_display_update_an_item_to_the_existing_shopping_list() {
        assertEquals(shoppingMenu.getMenuOption("4"), "4: Update an item on the shopping list");
    }

    @Test
    public void should_display_remove_item_on_the_existing_shopping_list() {
        assertEquals(shoppingMenu.getMenuOption("5"), "5: Remove item from the shopping list");
    }

    @Test
    public void should_display_mark_as_complete_on_the_existing_shopping_list() {
        assertEquals(shoppingMenu.getMenuOption("6"), "6: Mark as complete");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_illegal_Argument_Exception_for_invalid_input() {
        shoppingMenu.getMenuOption("20");
        assertEquals(shoppingMenu.getMenuOption("20"), new IllegalArgumentException("Invalid menu option, please select a valid option"));
    }
}