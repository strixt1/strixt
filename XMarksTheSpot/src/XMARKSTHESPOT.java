import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class XMARKSTHESPOT {
    public static void main(String[] args) throws Exception {
        /*
         * X Marks the spot
         *
         * Instructions:
         * 1 - Create a 2D array (5 width, 7 height)
         * 2 - Randomly pick a coordinate inside the 2D array to mark as X
         * 3 - Get the user to guess a coordinate within the 2D array (use the
         * getUserNumberInput function provided to help)
         * 4 - If the guessed coordinate is X, exit the app with a "you win"
         * 5 - If the guessed coordinate is not X, tell the user the guess is incorrect
         * and repeat steps 3-5
         *
         * Recommended: Handle any errors that might occur (examples are but not limited
         * to: preventing the user from inputting a coordinate outside the 2D array)
         *
         * Optional: Prevent the user from guessing the same coordinate twice
         * Optional: Print out the previous guesses after every incorrect guess (use the
         * print2DArray function provided to help)
         */        
        System.out.println("Guess where the hidden X is on the Coordinate Grid");
        char[][] xmarksthepot_array = new char[5][7];
        int row, column; 
        int x,y; //these are the coordinates
        for (row = 0; row < 5; row++) //execute the loop for each row
        {
            for (column = 0; column < 7; column++)// exectue the loop for each column
            {
                xmarksthepot_array[row][column] = '+';

            }
        }
        
        
        for (row = 0; row < 5; row++) //execute the loop for each row
        {
            for (column = 0; column < 7; column++)// exectue the loop for each column
            {
                System.out.print(xmarksthepot_array[row][column] + " ");

            }
            System.out.println();
        }

    

        Random random = new Random();
    
        int seed = 29409198 - random.nextInt(29409198);
        random.setSeed(seed);

        int RX = random.nextInt(5);

        int RY = random.nextInt(7);

        //System.out.print(RX);
        
        //System.out.print(RY);
        
        xmarksthepot_array[RX][RY] = 'X';

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Guess the x-value between 0 and 4: ");
        int x_guess = scanner.nextInt();
        
        // Check if x value is within range
        while (x_guess > 4 || x_guess < 0)
        {
            System.out.println("Invalid X Value. Enter a value between 0 and 4");
            x_guess = scanner.nextInt();
        }
        
        // Check if x-value equals RX
        ArrayList guesses_x = new ArrayList<>();
        while (x_guess < RX || x_guess > RX)
        {
            if (x_guess < RX)
            {
                System.out.println("Incorrect. Input is greater than hidden x-value. Guess again");
            }
            else if (x_guess > RX)
            {
                System.out.println("Incorrect. Input is less than hidden x-value. Guess again");
            }
            x_guess = scanner.nextInt();
        }
        System.out.println("Good job, you found the x-value. Now enter the y-value "); 
        
        System.out.println(" ");
        
        System.out.println("Guess the y-value between 0 and 6: ");
        int y_guess = scanner.nextInt();
        
        // Check if y value is within range
        while (y_guess > 6 || y_guess < 0)
        {
            System.out.println("Invalid Y Value. Enter a value between 0 and 6");
            y_guess = scanner.nextInt();
        }
        
        // Check if y-value equals RY
        while (y_guess < RY || y_guess > RY)
        {
            if (y_guess < RY)
            {
                System.out.println("Incorrect. Input is greater than hidden y-value. Guess again ");
            }
            else if (y_guess > RY)
            {
                System.out.println("Incorrect. Input is less than hidden y-value. Guess again ");
            }
            y_guess = scanner.nextInt();
        }

        System.out.println("Good job, you found the y-value.\n"); 
        
        System.out.println("Congratz, you have found the missing X value");
        
        scanner.close();
        
    }  
}