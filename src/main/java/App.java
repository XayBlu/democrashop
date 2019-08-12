import menu.ShoppingMenu;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean exit = false;

        do{
            ShoppingMenu.displayMenu();
            String input = scanner.nextLine();
            System.out.println(ShoppingMenu.getMenuOption(input));
            scanner.nextLine();
        } while (exit);
    }
}

// QUESTIONS --
// how are is the boolean variable working we never change the assigned value;
// why do we need the last Scanner.nextLine() --- line 18

