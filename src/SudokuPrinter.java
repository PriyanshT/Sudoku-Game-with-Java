/**	Application Purpose: To create a class called SudokuPrinter which prints the pre-defined data or solution matrix on the console.
    Author: Priyansh Thakar
    Date: 03 April 2021
    Time: 06:48 PM
 */

public class SudokuPrinter
{
    // A static method to print the matrix in 9 x 9 way
    public static void printMatrix(int[][] matrix)
    {
        // Keeping in try block to check for exceptions
        try
        {
            // Looping for the account of rows
            for (int i = 0; i < 9; i++)
            {
                // Looping for the account of columns
                for (int j = 0; j < 9; j++)
                {
                    // Printing the value with spaces
                    System.out.print(matrix[i][j] + " ");
                }

                // Printing a new line for next row
                System.out.println();
            }
        }

        // Catching the NullPointerException
        catch (NullPointerException e)
        {
            System.out.println("Null Pointer Exception occurred.");
            System.out.println("Please Enter not-null values.");
        }

        // Catching the IndexOutOfBoundsException
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Index out of Bounds Exception occurred.");
            System.out.println("Please Enter integer values from 0-9.");
        }
    }
}
