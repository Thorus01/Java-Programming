import java.util.ArrayList;

/**
 * Main class of Assessment 2.
 * @version 1
 */
public class Assessment2
{
    public static void main(String[] args)
    {
        System.out.println("Task 3 output: ");
        task3();

        System.out.println();
        System.out.println("Task 6 output: ");
        task6();

    }

    /**
     * Creates a new instance of HeightDatabase, adds 10 random numbers,
     * then prints the contents of the database.
     */
    public static void task3()
    {
        HeightDatabase db = new HeightDatabase();

        for (int i = 0; i < 10; i++)
        {
            db.addHeight((Math.random() * 110) + 100);
        }

        System.out.println(db.toString());
    }

    /**
     * Creates a new instance of HeightDatabase, adds 10 values, then prints the mean and
     * standard deviation. It then removes the outliers and prints the remaining values.
     */
    public static void task6()
    {
        HeightDatabase dataBase = new HeightDatabase();
        dataBase.addHeight(79.4);
        dataBase.addHeight(146.0);
        dataBase.addHeight(150.2);
        dataBase.addHeight(158.8);
        dataBase.addHeight(161.5);
        dataBase.addHeight(164.1);
        dataBase.addHeight(165.9);
        dataBase.addHeight(172.3);
        dataBase.addHeight(180.7);
        dataBase.addHeight(250.9);

        System.out.println("mean: " + dataBase.getMean());
        System.out.println("standard deviation: " + dataBase.getStdDev());
        dataBase.removeOutliers();
        System.out.println("Remaining heights: \n" + dataBase.toString());

    }
}
