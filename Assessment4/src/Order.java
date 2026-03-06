import java.util.ArrayList;

/**
 * Class representing an order at the restaurant.
 *
 * @version 1.0
 */
public class Order implements Food
{
    private String customerName;
    private String phoneNumber;
    private String deliveryAddress;
    private ArrayList<FoodItem> foodItems;
    private MealType mealType;
    private double price;

    public Order()
    {
        customerName = "";
        phoneNumber = "";
        deliveryAddress = "";
        foodItems = null;
        setPrice(calculatePrice());
        setMealType(calculateType());
    }

    public Order(String customerName, String phoneNumber, String deliveryAddress, ArrayList<FoodItem> foodItems)
    {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.deliveryAddress = deliveryAddress;
        this.foodItems = foodItems;
        setPrice(calculatePrice());
        setMealType(calculateType());
    }

    public double calculatePrice()
    {
        double newPrice = 0;

        if (foodItems != null)
        {
            for (FoodItem item : foodItems)
            {
                newPrice += item.getPrice();
            }
        }

        return newPrice;
    }

    public MealType calculateType()
    {
        MealType newType = MealType.VEGAN;

        if (foodItems != null)
        {
            for (FoodItem item : foodItems)
            {
                if (item.getMealType() == MealType.MEAT)
                {
                    newType = MealType.MEAT;
                    break;
                }
                else if (item.getMealType() == MealType.VEGETARIAN)
                {
                    newType = MealType.VEGETARIAN;
                }
            }
        }

        return newType;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getDeliveryAddress()
    {
        return deliveryAddress;
    }

    public ArrayList<FoodItem> getFoodItems()
    {
        return foodItems;
    }

    @Override
    public MealType getMealType()
    {
        return mealType;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setDeliveryAddress(String deliveryAddress)
    {
        this.deliveryAddress = deliveryAddress;
    }

    public void setFoodItems(ArrayList<FoodItem> foodItems)
    {
        this.foodItems = foodItems;
    }

    public void setMealType(MealType mealType)
    {
        this.mealType = mealType;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Order Details:\n\n" +
                "customerName: " + customerName + '\n' +
                "phoneNumber: " + phoneNumber + '\n' +
                "deliveryAddress: " + deliveryAddress + "\n\n" +
                "foodItems: " + "\n" + foodItems + "\n\n" +
                "mealType: " + mealType + "\n" +
                "price: " + price + "\n" +
                "\n--------------------------\n";
    }


}
