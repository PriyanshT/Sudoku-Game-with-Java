/**	Application Purpose: To create a class called SudokuSolver which contains the logic to solve a user provided Sudoku question.
    Author: Priyansh Thakar
    Date: 03 April 2021
    Time: 03:44 PM
 */

public class SudokuSolver
{
    // Declaring a private 2d matrix
    private int[][] matrix = new int[9][9];

    // Declaring a constant for highest value
    private final int HIGH = 9;

    // Creating Constructor that takes no arguments
    public SudokuSolver()
    {
        for (int row = 0; row < HIGH; row++)
        {
            for (int column = 0; column < HIGH; column++)
            {
                this.matrix[row][column] = 0;
            }
        }
    }

    // Creating Constructor that takes one matrix argument
    public SudokuSolver(int[][] matrix)
    {
        this.matrix = matrix;
    }

    // Setter method for matrix
    public void setMatrix(int[][] matrix)
    {
        this.matrix = matrix;
    }

    // Getter method for matrix
    public int[][] getMatrix()
    {
        return matrix;
    }

    // Method to solve matrix with trials
    public boolean attemptValues(int row, int column)
    {
        // Returning true if we reach the end to stop
        if (row == HIGH - 1 && column == HIGH)
        {
            return true;
        }

        // Increasing row and initializing column if we reach end of row
        if (column == HIGH)
        {
            row++;
            column = 0;
        }

        // Going ahead until 0 is not discovered
        if (matrix[row][column] != 0)
        {
            return attemptValues(row, column + 1);
        }

        // Adding proper values at 0 places
        for (int i = 1; i < 10; i++)
        {
            // If value is correct
            if (isProper(row, column, i) == true)
            {
                // Storing the new proper value
                matrix[row][column] = i;

                // Returning true if conditions satisfy
                if (attemptValues(row, column + 1) == true)
                {
                    return true;
                }
            }

            // Keeping 0 if value not found
            matrix[row][column] = 0;
        }

        // Returning false if not any condition matched
        return false;
    }

    // A private method to return true if ans is correct
    private boolean isProper(int row, int column, int num)
    {
        // Check the row for duplicate
        for (int i = 0; i <= 8; i++)
        {
            // Returning false if any duplicate found
            if (matrix[row][i] == num)
            {
                return false;
            }
        }

        // Check the column for duplicate
        for (int i = 0; i <= 8; i++)
        {
            // Returning false if any duplicate found
            if (matrix[i][column] == num)
            {
                return false;
            }
        }

        // Check 3 x 3 grid for duplicate
        int startRowPoint = (row - (row % 3));
        int startColumnPoint = (column - (column % 3));

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                // Returning false if any duplicate found
                if (matrix[i + startRowPoint][j + startColumnPoint] == num)
                {
                    return false;
                }
            }
        }

        // Returning true if all clear
        return true;
    }
}
