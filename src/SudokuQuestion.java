/**	Application Purpose: To create a class called SudokuQuestion which gives/generates a Sudoku matrix to be solved by the user.
    Author: Priyansh Thakar
    Date: 03 April 2021
    Time: 02:50 PM
 */

// Importing to use random generator
import java.util.Random;

public class SudokuQuestion
{
    // Declaring a private 2d matrix
    private int[][] matrix = new int[9][9];

    // Creating a private method to store our questions
    private int[][] matrixStorage(int value)
    {
        // Declaring a matrix to store the questions
        int[][] question = new int[9][9];

        // For random value 0
        if(value == 0)
        {
            int[][] question0 = {{0, 0, 0, 2, 6, 0, 7, 0, 1},
                                {6, 8, 0, 0, 7, 0, 0, 9, 0},
                                {1, 9, 0, 0, 0, 4, 5, 0, 0},
                                {8, 2, 0, 1, 0, 0, 0, 4, 0},
                                {0, 0, 4, 6, 0, 2, 9, 0, 0},
                                {0, 5, 0, 0, 0, 3, 0, 2, 8},
                                {0, 0, 9, 3, 0, 0, 0, 7, 4},
                                {0, 4, 0, 0, 5, 0, 0, 3, 6},
                                {7, 0, 3, 0, 1, 8, 0, 0, 0}};
            question = question0;
        }

        // For random value 1
        else if(value == 1)
        {
            int[][] question1 = {{1, 0, 0, 4, 8, 9, 0, 0, 6},
                                {7, 3, 0, 0, 0, 0, 0, 4, 0},
                                {0, 0, 0, 0, 0, 1, 2, 9, 5},
                                {0, 0, 7, 1, 2, 0, 6, 0, 0},
                                {5, 0, 0, 7, 0, 3, 0, 0, 8},
                                {0, 0, 6, 0, 9, 5, 7, 0, 0},
                                {9, 1, 4, 6, 0, 0, 0, 0, 0},
                                {0, 2, 0, 0, 0, 0, 0, 3, 7},
                                {8, 0, 0, 5, 1, 2, 0, 0, 4}};
            question = question1;
        }

        // For random value 2
        else if(value == 2)
        {
            int[][] question2 = {{0, 2, 0, 6, 0, 8, 0, 0, 0},
                                {5, 8, 0, 0, 0, 9, 7, 0, 0},
                                {0, 0, 0, 0, 4, 0, 0, 0, 0},
                                {3, 7, 0, 0, 0, 0, 5, 0, 0},
                                {6, 0, 0, 0, 0, 0, 0, 0, 4},
                                {0, 0, 8, 0, 0, 0, 0, 1, 3},
                                {0, 0, 0, 0, 2, 0, 0, 0, 0},
                                {0, 0, 9, 8, 0, 0, 0, 3, 6},
                                {0, 0, 0, 3, 0, 6, 0, 9, 0}};
            question = question2;
        }

        // For random value 3
        else if(value == 3)
        {
            int[][] question3 = {{0, 0, 0, 6, 0, 0, 4, 0, 0},
                                {7, 0, 0, 0, 0, 3, 6, 0, 0},
                                {0, 0, 0, 0, 9, 1, 0, 8, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 5, 0, 1, 8, 0, 0, 0, 3},
                                {0, 0, 0, 3, 0, 6, 0, 4, 5},
                                {0, 4, 0, 2, 0, 0, 0, 6, 0},
                                {9, 0, 3, 0, 0, 0, 0, 0, 0},
                                {0, 2, 0, 0, 0, 0, 1, 0, 0}};
            question = question3;
        }

        // For random value 4
        else if(value == 4)
        {
            int[][] question4 = {{2, 0, 0, 3, 0, 0, 0, 0, 0},
                                {8, 0, 4, 0, 6, 2, 0, 0, 3},
                                {0, 1, 3, 8, 0, 0, 2, 0, 0},
                                {0, 0, 0, 0, 2, 0, 3, 9, 0},
                                {5, 0, 7, 0, 0, 0, 6, 2, 1},
                                {0, 3, 2, 0, 0, 6, 0, 0, 0},
                                {0, 2, 0, 0, 0, 9, 1, 4, 0},
                                {6, 0, 1, 2, 5, 0, 8, 0, 9},
                                {0, 0, 0, 0, 0, 1, 0, 0, 2}};
            question = question4;
        }

        // Returning the question matrix
        return question;
    }

    // Creating a public method to generate Sudoku matrix
    public int[][] generatePuzzle()
    {
        // Creating an object of Random class
        Random rand = new Random();

        // Generating one random number with length 0-5
        int randomNumber1 = rand.nextInt(5);

        // Getting a question matrix with a random number
        matrix = matrixStorage(randomNumber1);

        // Returning the Question matrix
        return matrix;
    }
}
