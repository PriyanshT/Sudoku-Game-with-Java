/**	Application Purpose: To create a class called Sudoku which provides an entry point for compiler and allows the user to select option as per his/her need.
    Author: Priyansh Thakar
    Date: 03 April 2021
    Time: 02:32 PM
 */

// Importing to use Scanner for getting user data
import java.util.Scanner;

public class Sudoku
{
    public static void main(String []args)
    {
        // Declaring and Initializing flag variable to keep track of loop
        int flag = 1;

        Scanner in = new Scanner(System.in);

        // Looping until flag value is not 0
        while (flag == 1)
        {
            // Printing introductory statements
            System.out.println("---------------------------------------------------");
            System.out.println("Please provide your choice: ");
            System.out.println("1. Solve Pre-defined Sudoku puzzle?");
            System.out.println("2. Get a new question puzzle?");
            System.out.println("3. Solve your Sudoku puzzle?");
            System.out.println("4. Check your Sudoku puzzle?");
            System.out.println("5. Exit");

            // Storing user choice in variable
            int ch = in.nextInt();

            // For readability
            System.out.println("---------------------------------------------------");

            switch (ch)
            {
                // For solving pre-defined puzzle
                case 1:
                    // Declaring and Initializing a 2d array of matrix
                    int[][] matrix1 = {{5, 0, 8, 0, 1, 0, 4, 0, 7},
                            {3, 4, 0, 0, 0, 0, 9, 0, 0},
                            {1, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 7, 3, 0, 9, 1, 2, 5, 0},
                            {8, 0, 1, 7, 0, 6, 0, 4, 0},
                            {9, 2, 0, 0, 0, 5, 0, 7, 1},
                            {0, 8, 5, 4, 0, 0, 0, 0, 0},
                            {0, 1, 9, 5, 0, 0, 7, 0, 0},
                            {7, 3, 4, 0, 0, 0, 5, 9, 8}};

                    // Creating object of SudokuSolver
                    SudokuSolver ss1 = new SudokuSolver(matrix1);

                    // Solving Sudoku
                    if (ss1.attemptValues(0, 0) == true)
                    {
                        // Printing Sudoku matrix with static method
                        SudokuPrinter.printMatrix(matrix1);
                    }
                    else
                    {
                        System.out.println("No Solution exists");
                    }

                    break;

                // For providing the user with new question
                case 2:
                    // Declaring a new Sudoku matrix
                    int[][] matrix2 = new int[9][9];

                    System.out.println("Solve the following question:");

                    // Creating object of SudokuQuestion
                    SudokuQuestion sq1 = new SudokuQuestion();

                    // Storing the puzzle question in the matrix
                    matrix2 = sq1.generatePuzzle();

                    // Printing Sudoku matrix with static method
                    SudokuPrinter.printMatrix(matrix2);

                    break;

                // For providing the solution of user's question
                case 3:
                    // Declaring a new Sudoku matrix
                    int[][] matrix3 = new int[9][9];

                    System.out.println("Please provide your 9 x 9 matrix.");
                    System.out.println("Give out space between each column element and enter after each row.");
                    System.out.println("You can enter now:");

                    // Storing each user integer into our matrix array
                    for (int row = 0; row < 9; row++)
                    {
                        for (int column = 0; column < 9; column++)
                        {
                            matrix3[row][column] = in.nextInt();
                        }
                    }

                    // Creating object of SudokuSolver
                    SudokuSolver ss2 = new SudokuSolver();

                    // Using the setter to add matrix to ss2
                    ss2.setMatrix(matrix3);

                    // Solving Sudoku
                    if (ss2.attemptValues(0, 0) == true)
                    {
                        // Printing Sudoku matrix with static method
                        SudokuPrinter.printMatrix(ss2.getMatrix());
                    }
                    else
                    {
                        System.out.println("No Solution exists");
                    }

                    break;

                // For checking the user's provided Sudoku
                case 4:
                    // Declaring a new Sudoku matrix
                    int[][] matrix4 = new int[9][9];

                    System.out.println("Please provide your 9 x 9 matrix.");
                    System.out.println("Give out space between each column element and enter after each row.");
                    System.out.println("You can enter now:");

                    // Storing each user integer into our matrix array
                    for (int row = 0; row < 9; row++)
                    {
                        for (int column = 0; column < 9; column++)
                        {
                            matrix4[row][column] = in.nextInt();
                        }
                    }

                    // Checking Sudoku with static method
                    if(SudokuChecker.checkMatrix(matrix4) == true)
                    {
                        System.out.println("Congratulations! You solved it.");
                    }
                    else
                    {
                        System.out.println("Opps! You missed this time.");
                        System.out.println("You can try our Sudoku Solver to get your answer.");
                    }
                    break;

                // Manipulating the value of flag to exit
                case 5:
                    flag = 0;
                    break;

                // Giving the default message
                default:
                    System.out.println("Please enter a value from 1-5.");
            }
        }
    }
}
