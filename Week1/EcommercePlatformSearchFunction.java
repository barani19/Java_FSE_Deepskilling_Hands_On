
import java.util.*;

class Dish {

    int id;
    String name;
    String cuisine;

    Dish(int id, String name, String cuisine) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
    }

    public String toString() {
        return id + " - " + name + " (" + cuisine + ")";
    }
}

public class EcommercePlatformSearchFunction {

    public static void main(String[] args) {
        Dish[] menu = {
            new Dish(101, "Butter Chicken", "Indian"),
            new Dish(102, "Margherita Pizza", "Italian"),
            new Dish(103, "Chicken Tacos", "Mexican"),
            new Dish(104, "Pad Thai", "Thai"),
            new Dish(105, "Cheeseburger", "American"),
            new Dish(106, "Ramen", "Japanese")
        };

        Arrays.sort(menu, Comparator.comparing(d -> d.name.toLowerCase()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to FoodFiesta!");
        System.out.print("What dish are you craving today? ");
        String searchQuery = scanner.nextLine();

        int low = 0, high = menu.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = searchQuery.compareToIgnoreCase(menu[mid].name);
            if (compare == 0) {
                System.out.println("Found: " + menu[mid]);
                found = true;
                break;
            } else if (compare < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Sorry, we couldn't find that dish on our menu.");
        }
    }
}
