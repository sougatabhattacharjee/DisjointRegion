class DisjointRegionsFinder {

    private static final int MARK_AS_VISITED = Integer.MIN_VALUE;

    protected static int countDisjointRegions(final int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return 0;

        if (!isValidIntegers(array)) return 0;

        final int row = array.length, col = array[0].length;
        int regionCounter = 0;

        for (int row_index = 0; row_index < row; row_index++) {
            for (int col_index = 0; col_index < col; col_index++) {
                if (array[row_index][col_index] != 0
                        && array[row_index][col_index] != MARK_AS_VISITED) {
                    regionCounter++;
                    inPlaceMarkElementAsVisited(array, row_index, col_index);
                }
            }
        }
        return regionCounter;
    }

    /**
     * In-Place marking of an element as visited
     *
     * @param inputArray   input array
     * @param currRowIndex starting index in a row
     * @param currColIndex starting column index in a column
     */
    private static void inPlaceMarkElementAsVisited(final int[][] inputArray,
                                                    final int currRowIndex, final int currColIndex) {

        final int currRow = inputArray.length, currCol = inputArray[0].length;

        if (currRowIndex == -1 || currRowIndex >= currRow
                || currColIndex == -1 || currColIndex >= currCol
                || (inputArray[currRowIndex][currColIndex] == 0
                || inputArray[currRowIndex][currColIndex] == MARK_AS_VISITED))
            return;

        inputArray[currRowIndex][currColIndex] = MARK_AS_VISITED;

        inPlaceMarkElementAsVisited(inputArray, currRowIndex, currColIndex - 1);
        inPlaceMarkElementAsVisited(inputArray, currRowIndex, currColIndex + 1);
        inPlaceMarkElementAsVisited(inputArray, currRowIndex - 1, currColIndex);
        inPlaceMarkElementAsVisited(inputArray, currRowIndex + 1, currColIndex);
    }

    /**
     * the method is checking if there is any integer is too large or small
     *
     * @param array input 2D-array
     * @return true | false
     */
    private static boolean isValidIntegers(final int[][] array) {
        final int col = array[0].length;
        for (final int[] anArray : array) {
            for (int j = 0; j < col; j++) {
                if (anArray[j] >= Integer.MAX_VALUE
                        || anArray[j] <= Integer.MIN_VALUE)
                    return false;
            }
        }
        return true;
    }

}
