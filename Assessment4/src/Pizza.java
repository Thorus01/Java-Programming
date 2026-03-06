import java.util.ArrayList;

/**
 * Class representing a pizza.
 *
 * @version 1.0
 */
public class Pizza extends FoodItem
{
    public enum Topping
    {
        HAM,
        CHEESE,
        PINEAPPLE,
        MUSHROOMS,
        TOMATO,
        SEAFOOD
    }
    public static final double FINAL_GENERIC_TOPPING_PRICE = 2;
    public static final double FINAL_PINEAPPLE_PRICE = 2.5;
    public static final double FINAL_SEAFOOD_PRICE = 3.5;
    private ArrayList<Topping> toppingList;
    private double price;
    private MealType type;

    public Pizza()
    {
        super();
        toppingList = null;
        setPrice(calculatePrice());
        setType(calculateType());
    }

    public Pizza(ArrayList<Topping> toppingList)
    {
        super();
        this.toppingList = toppingList;
        setPrice(calculatePrice());
        setType(calculateType());
    }

    @Override
    public double calculatePrice()
    {
        double newPrice = FINAL_BASE_COST;

        if (toppingList != null)
        {
            for (Topping topping : toppingList)
            {
                if (topping == Topping.HAM || topping == Topping.CHEESE || topping == Topping.TOMATO
                || topping == Topping.MUSHROOMS)
                {
                    newPrice += FINAL_GENERIC_TOPPING_PRICE;
                }
                else if (topping == Topping.PINEAPPLE)
                {
                    newPrice += FINAL_PINEAPPLE_PRICE;
                }
                else if (topping == Topping.SEAFOOD)
                {
                    newPrice += FINAL_SEAFOOD_PRICE;
                }
            }
        }

        return newPrice;
    }

    @Override
    public MealType calculateType()
    {
        MealType newType = MealType.VEGAN;

        if (toppingList != null)
        {
            if (toppingList.contains(Topping.HAM) || toppingList.contains(Topping.SEAFOOD))
            {
                newType = MealType.MEAT;
            }
            else if (toppingList.contains(Topping.CHEESE))
            {
                newType = MealType.VEGETARIAN;
            }
        }

        return newType;
    }

    @Override
    public MealType getMealType()
    {
        return type;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    public ArrayList<Topping> getToppingList()
    {
        return toppingList;
    }

    public void setToppingList(ArrayList<Topping> toppingList)
    {
        this.toppingList = toppingList;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setType(MealType type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "Pizza\n" +
                "toppingList: " + toppingList + "\n" +
                "price: " + price + "\n" +
                "type: " + type + "\n";
    }
}
