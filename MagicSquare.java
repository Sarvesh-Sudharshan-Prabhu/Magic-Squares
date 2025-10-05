public class MagicSquare
{
    private int[][] square;
    private int i;

    /**
     * Constructs an n by n MagicSquare
     *
     * @param n
     */
    public MagicSquare(int n)
    {
        this.i = 0;
        this.square = new int[n][n];
    }

    /**
     * Inserts x at the index i, the next available
     * slot following row-major order.
     *
     * @param x
     */
    public void add(int x)
    {
        square[i/ square.length][i% square.length] = x;
        i=i+1;

    }
    /**
     * @param nums
     * @return The sum of nums
     */
    private int sum ( int[] nums)
    {
        int sum = 0;
        for (int j = 0; j < nums.length ; j++)
        {
            sum = sum + nums[j];
        }
        return sum;
    }

    /**
     * @return The constant that each row, column,
     *          and diagonal should add-up to.
     */
    private int getConstant ()
    {
        int constant = (((square.length * (square.length * square.length + 1)) / 2));
        return constant;
    }

    /**
     * @return true if each row, column, and diagonal
     *          add-up to the constant; false otherwise
     */
    public boolean isMagical ()
    {
        boolean isMagical = isMagicalColumns() && isMagicalRows() && isMagicalDiagonals();
        return isMagical;
    }

    /**
     * @return true if each row adds-up to the constant;
     *          false otherwise
     */
    private boolean isMagicalRows () {
        for (int j = 0; j < square.length; j++)
        {
            int sum = 0;

            for (int k = 0; k < square[j].length; k++)
            {
                sum = sum + square[j][k];
            }
            if (sum != getConstant ()) {
                return false;
            }

        }
        return true;

    }
    /**
     * @return true if each column adds-up to the constant;
     *          false otherwise
     */
    private boolean isMagicalColumns ()
    {
        for (int j = 0; j < square[0].length ; j++)
        {
            int sum = 0;
            for (int k = 0; k < square.length ; k++)
            {
                sum = sum + square[k][j];
            }
            if (sum != getConstant ())
            {
                return false;
            }
        }
        return true;
    }

    /**
     * @return true if each diagonal adds-up to the constant;
     *          false otherwise
     */
    private boolean isMagicalDiagonals ()
    {
        int y = 0;
        int x = 0;
        for (int j = 0; j < square.length ; j++)
        {
            x = x + square[j][square.length-j-1];
            y =  y + square[j][j];
        }
        return y == getConstant () && x == getConstant ();
    }

    /**
     * @return A String representation of this MagicSquare.
     */
    public String toString ()
    {
        String rtn = "";

        for (int[] row : square)
        {
            for (int element : row)
                rtn += element + "\t";
            rtn += "\n";
        }

        return rtn;
    }
}
