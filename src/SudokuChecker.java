/**	Application Purpose: To create a class called SudokuChecker which checks the Sudoku matrix for problems.
    Author: Priyansh Thakar
    Date: 05 April 2021
    Time: 03:59 PM
 */

public class SudokuChecker
{
    // A static method to check the matrix of 9 x 9
    public static boolean checkMatrix(int[][] matrix)
    {
        // To check the row for duplicates
        for (int row = 0; row < 9; row++)
        {
            for (int column = 0; column < 8; column++)
            {
                for (int nextColumn = column + 1; nextColumn < 9; nextColumn++)
                {
                    // Returning false if any duplicate found
                    if (matrix[row][column] == matrix[row][nextColumn])
                    {
                        return false;
                    }
                }
            }
        }

        // To check the column for duplicates
        for (int column = 0; column < 9; column++)
        {
            for (int row = 0; row < 8; row++)
            {
                for (int nextRow = row + 1; nextRow < 9; nextRow++)
                {
                    // Returning false if any duplicate found
                    if (matrix[row][column] == matrix[nextRow][column])
                    {
                        return false;
                    }
                }
            }
        }

        // To check each 3 x 3 grid for duplicates
        for(int row = 0; row < 9; row += 3)
        {
            for (int col = 0; col < 9; col += 3)
            {
                // Pointing the top left-most point of each 3 x 3 grid
                for (int point = 0; point < 8; point++)
                {
                    for (int nextPoint = point + 1; nextPoint < 9; nextPoint++)
                    {
                        // Returning false if any duplicate found
                        if (matrix[row + point%3][col + point/3] == matrix[row + nextPoint%3][col + nextPoint/3])
                        {
                            return false;
                        }
                    }
                }
            }
        }

        // Returning true if all clear
        return true;
    }
}
