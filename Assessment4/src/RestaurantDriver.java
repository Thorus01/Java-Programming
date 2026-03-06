import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class representing the main restaurant operations, takes input from customers to create and
 * manipulate orders.
 *
 * @version 1.0
 */
public class RestaurantDriver
{
    private ArrayList<Order> orderList;

    public RestaurantDriver()
    {
        orderList = new ArrayList<Order>();
    }

    public static void main(String[] args)
    {
        RestaurantDriver restaurant = new RestaurantDriver();
        Scanner scanner = new Scanner(System.in);
        int selection = 0;

        while (true)
        {
            System.out.println("Main Menu");
            System.out.println("---------");
            System.out.println("Input 1 to add a new order");
            System.out.println("Input 2 to deliver the next order");
            System.out.println("Input 3 to see all current orders");
            System.out.println("Input 4 to exit program");
            try
            {
                selection = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid Input\n");
                scanner.next();
            }

            if (selection == 1)
            {
                restaurant.newOrder();
            }
            else if (selection == 2)
            {
                restaurant.deliverOrder();
            }
            else if (selection == 3)
            {
                restaurant.printOrders();
            }
            else if (selection == 4)
            {
                break;
            }
            else
            {
                System.out.println("Please select a valid option \n");
            }
        }
    }

    public void addFoodItems(ArrayList<FoodItem> foodItems)
    {
        int selection = 0;
        Scanner scanner = new Scanner((System.in));
        System.out.println("Please select your food items:\n");

        while (true)
        {
            System.out.println("Input 1 to add a pizza ($11.50 base price)");
            System.out.println("Input 2 to add a pasta ($11.50 base price)");
            System.out.println("Input 3 to finish adding items");
            try
            {
                selection = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid Input");
                scanner.next();
            }

            if (selection == 1)
            {
                foodItems.add(addPizza());
                System.out.println("\nPizza added successfully");
            }
            else if (selection == 2)
            {
                foodItems.add(addPasta());
                System.out.println("\nPasta added successfully");
            }
            else if (selection == 3)
            {
                break;
            }
            else
            {

            }
        }
    }

    public Pasta addPasta()
    {
        int selection = 0;
        Scanner scanner = new Scanner((System.in));
        Pasta.Topping topping = null;
        System.out.println("Please select your topping:\n");
        System.out.println("Input 1 to select tomato (vegan)");
        System.out.println("Input 2 to select bolognese (meat)");
        System.out.println("Input 3 to select primavera (vegetarian)");
        System.out.println("Input 4 to select marinara (meat)");
        System.out.println("Input 5 for no topping");

        while (true)
        {
            try
            {
                selection = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid Input");
                scanner.next();
            }

            if (selection == 1)
            {
                topping = Pasta.Topping.TOMATO;
                System.out.println("Tomato selected");
                break;
            }
            else if (selection == 2)
            {
                topping = Pasta.Topping.BOLOGNESE;
                System.out.println("Bolognese selected");
                break;
            }
            else if (selection == 3)
            {
                topping = Pasta.Topping.PRIMAVERA;
                System.out.println("Primavera selected");
                break;
            }
            else if (selection == 4)
            {
                topping = Pasta.Topping.MARINARA;
                System.out.println("Marinara selected");
                break;
            }
            else if (selection == 5)
            {
                // topping is already null
                System.out.println("No topping selected");
                break;
            }
            else
            {
                System.out.println("Please select a valid option \n");
            }
        }

        Pasta pasta = new Pasta(topping);
        return pasta;
    }

    public Pizza addPizza()
    {
        int selection = 0;
        Scanner scanner = new Scanner((System.in));
        ArrayList<Pizza.Topping> toppingList = new ArrayList<Pizza.Topping>();
        System.out.println("Please select your toppings:\n");
        System.out.println("Input 1 to add ham (meat)");
        System.out.println("Input 2 to add cheese (vegetarian)");
        System.out.println("Input 3 to add pineapple (vegan)");
        System.out.println("Input 4 to add mushrooms (vegan)");
        System.out.println("Input 5 to add tomato (vegan)");
        System.out.println("Input 6 to add seafood (meat)");
        System.out.println("Input 7 to finish adding toppings");
        System.out.println("Input 8 for no toppings");

        while (true)
        {
            try
            {
                selection = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid Input");
                scanner.next();
            }

            if (selection == 1)
            {
                toppingList.add(Pizza.Topping.HAM);
                System.out.println("Ham added");
            }
            else if (selection == 2)
            {
                toppingList.add(Pizza.Topping.CHEESE);
                System.out.println("Cheese added");
            }
            else if (selection == 3)
            {
                toppingList.add((Pizza.Topping.PINEAPPLE));
                System.out.println("Pineapple added");
            }
            else if (selection == 4)
            {
                toppingList.add(Pizza.Topping.MUSHROOMS);
                System.out.println("Mushrooms added");
            }
            else if (selection == 5)
            {
                toppingList.add(Pizza.Topping.TOMATO);
                System.out.println("Tomato added");
            }
            else if (selection == 6)
            {
                toppingList.add(Pizza.Topping.SEAFOOD);
                System.out.println("Seafood added");
            }
            else if (selection == 7)
            {
                break;
            }
            else if (selection == 8)
            {
                toppingList = null;
                System.out.println("No toppings selected");
                break;
            }
            else
            {
                System.out.println("Please select a valid option\n");
            }
        }

        Pizza pizza = new Pizza(toppingList);
        return pizza;
    }

    public void deliverOrder()
    {
        int firstItemIndex = 0;
        if (!orderList.isEmpty())
        {
            System.out.println("Order delivered!");
            System.out.println(orderList.get(firstItemIndex).toString());
            orderList.remove(firstItemIndex);
        }
        else
        {
            System.out.println("No orders to deliver!\n");
        }
    }

    public ArrayList<Order> getOrderList()
    {
        return orderList;
    }

    public void newOrder()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("Input delivery address");
        String deliveryAddress = scanner.nextLine();

        System.out.println("Input phone number:");
        String phoneNumber = "";
        while (true)
        {
            try
            {
                phoneNumber = Integer.toString(scanner.nextInt());
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a number!");
                scanner.next();
            }
        }

        ArrayList<FoodItem> foodItems = new ArrayList<FoodItem>();
        addFoodItems(foodItems);

        Order order = new Order(customerName, phoneNumber, deliveryAddress, foodItems);
        orderList.add(order);
    }

    public void printOrders()
    {
        if (!orderList.isEmpty())
        {
            for (Order order : orderList)
            {
                System.out.println(order.toString());
            }
        }
        else
        {
            System.out.println("No current orders!\n");
        }
    }

    public void setOrderList(ArrayList<Order> orderList)
    {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "RestaurantDriver{" +
                "orderList=" + orderList +
                '}';
    }
}