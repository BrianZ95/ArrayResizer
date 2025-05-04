public class ArrayResizer {

    /**
     * Returns true if and only if every value in row r
     * of array2D is non-zero.
     * Precondition: r is a valid row index in array2D.
     * Postcondition: array2D is unchanged.
     */
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int i = 0; i < array2D[0].length; i++){
            if (array2D[r][i] == 0) return false;
        }
        return true;
    }


    /**
     * Returns the number of rows in array2D that contain
     * all non-zero values.
     * Postcondition: array2D is unchanged.
     */
    public static int numNonZeroRows(int[][] array2D) {
        int count = array2D.length;
        for (int j = 0; j < array2D.length; j++){
            for (int i = 0; i < array2D[0].length; i++){
                if (array2D[j][i] == 0){
                 count--;
                 if (j < array2D.length - 1){
                    j++;
                    i = 0;
                 }
                }    
            }
        }
        return count;
        /* implementation not shown */ }


    /**
     * Returns a new, possibly smaller, two-dimensional array
     * that contains only rows
     * from array2D with no zeros, as described in part (b).
     * Precondition: array2D contains at least one column and
     * at least one row with no zeros.
     * Postcondition: array2D is unchanged.
     */
    public static int[][] resize(int[][] array2D) {
        int countIndex = 0;
        int[][] newArray = new int[numNonZeroRows(array2D)][array2D[0].length];
        for (int j = 0; j < array2D.length; j++){
            int count = 0;
            for (int i = 0; i < array2D[0].length; i++){   
                if (array2D[j][i] != 0) count++;
                if (count == array2D[0].length){
                    newArray[countIndex] = array2D[j];
                    countIndex++;
                }
                }
            }
            return newArray;
        } 
    }