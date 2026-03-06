import java.util.ArrayList;

/**
 * Class representing a database of student heights
 * @version 1
 */
public class HeightDatabase
{
    private ArrayList<Double> heights;

    public HeightDatabase()
    {
        heights = new ArrayList<Double>();
    }

    public HeightDatabase(ArrayList<Double> heights)
    {
        this.heights = heights;
    }

    public ArrayList<Double> getHeights()
    {
        return heights;
    }

    public double getMean()
    {
        double mean = 0;

        for (int i = 0; i < heights.size(); i++)
        {
            mean += heights.get(i);
        }
        mean = mean/heights.size();

        return mean;
    }

    public double getStdDev()
    {
        double squaredDistancesFromMean = 0;
        double StdDev = 0;
        double mean = getMean();

        for (int i = 0; i < heights.size(); i++)
        {
            //subtracts the mean from the current value, then squares it and adds to the total
            squaredDistancesFromMean += Math.pow(heights.get(i) - mean, 2);
        }
        // gets the average of the squared distances from the mean, then gets the square root
        StdDev = Math.sqrt(squaredDistancesFromMean / heights.size());

        return StdDev;
    }

    public void setHeights(ArrayList<Double> heights)
    {
        this.heights = heights;
    }

    public void addHeight(double height)
    {
        heights.add(height);
    }

    public void removeHeight(int index)
    {
        heights.remove(index);
    }

    public void removeOutliers()
    {
        double mean = getMean();
        double stdDev = getStdDev();

        for (int i = 0; i < heights.size(); i++)
        {
            // checks if the height is greater than 2 standard deviations above the mean
            if (heights.get(i) > (mean + (stdDev * 2)))
            {
                System.out.println("Removing height " + heights.get(i));
                removeHeight(i);
            }
            //checks if the height is less than 2 standard deviations below the mean
            else if (heights.get(i) < (mean - (stdDev * 2)))
            {
                System.out.println("Removing height " + heights.get(i));
                removeHeight(i);
            }
        }
    }

    public String toString()
    {
        String heightsString = "";

        for (double i : heights)
        {
            heightsString += i + "\n";
        }

        return heightsString;
    }
}
