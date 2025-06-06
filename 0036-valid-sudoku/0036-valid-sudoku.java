
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use sets to track seen numbers
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {            // Rows
            for (int j = 0; j < 9; j++) {        // Columns
                char num = board[i][j];
                if (num != '.') {
                    // Check for duplicates in row, column, and 3x3 box
                    String rowKey = num + " in row " + i;
                    String colKey = num + " in col " + j;
                    String boxKey = num + " in box " + (i / 3) + "-" + (j / 3);

                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}