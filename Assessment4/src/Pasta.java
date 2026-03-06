/**
 * Class representing a pasta item.
 *
 * @version 1.0
 */
public class Pasta extends FoodItem
{
    public enum Topping
    {
        BOLOGNESE,
        MARINARA,
        PRIMAVERA,
        TOMATO
    }
    public static final double FINAL_TOMATO_PRICE = 4;
    public static final double FINAL_BOLOGNESE_PRICE = 5.20;
    public static final double FINAL_PRIMAVERA_PRICE = 5.20;
    public static final double FINAL_MARINARA_PRICE = 6.80;
    private Topping topping;
    private double price;
    private MealType type;

    public Pasta()
    {
        super();
        topping = null;
        setPrice(calculatePrice());
        setType(calculateType());
    }

    public Pasta(Topping topping)
    {
        super();
        this.topping = topping;
        setPrice(calculatePrice());
        setType(calculateType());
    }

    @Override
    public double calculatePrice()
    {
        double newPrice = FINAL_BASE_COST;

        if (topping != null)
        {
            if (topping == Topping.TOMATO)
            {
                newPrice += FINAL_TOMATO_PRICE;
            }
            else if (topping == Topping.BOLOGNESE)
            {
                newPrice += FINAL_BOLOGNESE_PRICE;
            }
            else if (topping == Topping.PRIMAVERA)
            {
                newPrice += FINAL_PRIMAVERA_PRICE;
            }
            else if (topping == Topping.MARINARA)
            {
                newPrice += FINAL_MARINARA_PRICE;
            }
        }

        return newPrice;
    }

    @Override
    public MealType calculateType()
    {
        MealType newType = MealType.VEGAN;

        if (topping != null)
        {
            if (topping == Topping.BOLOGNESE || topping == Topping.MARINARA)
            {
                newType = MealType.MEAT;
            }
            else if (topping == Topping.PRIMAVERA)
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

    public Topping getTopping()
    {
        return topping;
    }

    public void setTopping(Topping topping)
    {
        this.topping = topping;
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
        return "Pasta\n" +
                "topping: " + topping + "\n" +
                "price: " + price + "\n" +
                "type: " + type + "\n";
    }
}
