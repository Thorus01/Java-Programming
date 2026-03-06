/**
 * Abstract class representing a food item.
 *
 * @version 1.0
 */
public abstract class FoodItem implements Food
{
    public static final double FINAL_BASE_COST = 11.5;

    public FoodItem()
    {

    }

    public abstract double calculatePrice();

    public abstract MealType calculateType();
}
