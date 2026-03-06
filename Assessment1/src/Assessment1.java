import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

/**
 * Main class of Assessment 1
 * Version: 1
 */
public class Assessment1
{
    public static void main(String[] args)
    {

        Assessment1 a1 = new Assessment1();

        // Instruction: To run your respective task, uncomment below individually
        a1.task1();
        a1.task2();
        a1.task3();
        a1.task4();
    }

    // code your task 1(a) as a method here
    /**
     * Calculates the hypotenuse given the two other sides
     *
     * @param a length of first side
     * @param b length of second side
     * @return the square root of a and b squared, the hypotenuse
     */
    public double lengthOfHypotenuse(double a, double b)
    {
        return Math.sqrt((a * a) + (b * b));
    }

    /**
     * Stores and prints the hypotenuse given two lengths
     */
    public void task1()
    {
        // code your task 1(b) here
        double hypotenuse = lengthOfHypotenuse(3.0, 4.0);
        System.out.println(hypotenuse);
    }

    /**
     * Creates and manipulates an instance of the Student class
     */
    public void task2()
    {
        // code your task 2b here
        Student student1 = new Student("Sam Student", 12345678, 75.5);
        student1.setStudentWam(86.6);
        System.out.println(student1.getStudentWam());
    }

    /**
     * collects an integer and tells the user their corresponding grade
     */
    public void task3()
    {
        // code your task 3 here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 100 inclusive");
        int chosenInteger = scanner.nextInt();
        if (chosenInteger > 100 || chosenInteger < 0)
        {
            System.out.println("Number is outside the required range");
        }
        else if (chosenInteger >= 80)
        {
            System.out.println("Your grade is a HD");
        }
        else if (chosenInteger >= 70)
        {
            System.out.println("Your grade is a D");
        }
        else if (chosenInteger >= 60)
        {
            System.out.println("Your grade is a C");
        }
        else if (chosenInteger >= 50)
        {
            System.out.println("Your grade is a P");
        }
        else
        {
            System.out.println("Your grade is a N");
        }
    }

    /**
     * Takes 10 integers, calculates the average and then outputs the average
     * and all items below the average
     */
    public void task4()
    {
        // code your task 4 here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers separated by one space each: ");
        Integer[] integerArray = new Integer[10];
        int counter = 0;
        for (int i = 0; i < integerArray.length; i++)
        {
            integerArray[i] = scanner.nextInt();
            counter += integerArray[i];
        }
        double average = counter / integerArray.length;
        System.out.println("The average is: " + average);
        System.out.print("These numbers are below the average: ");
        for (int i = 0; i < integerArray.length; i++)
        {
            if (integerArray[i] < average)
            {
                System.out.print(integerArray[i] + " ");
            }
        }
    }
}