package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        /**
         * A valid sudoku has the following properties:
         * 1) each row/column has number 1- 9 occurs only once
         * 2) each 3x3 sub-box has number 1-9 occurs only once
         *
         * We need to check row/column/sub-box --> (find constant in a collection - HashMap)
         */

        for (int i = 0; i < 9; i++) {
            int[] row = new int[9];
            int[] col = new int[9];
            int[] subBox = new int[9];

            for (int j = 0; j < 9; j++) {
                int rowNum = board[i][j];
                int colNum = board[j][i];
                int sbNum = board[3*(i/3)+(j/3)][3*(i%3)+(j%3)];

                if (rowNum != '.' && row[rowNum - 1 - '0'] != 0) {
                    return false;
                } else if (rowNum != '.' && row[rowNum - 1 - '0'] == 0) {
                    row[rowNum - 1 - '0'] = 1;
                }

                if (colNum != '.' && col[colNum - 1 - '0'] != 0) {
                    return false;
                } else if (colNum != '.' && col[colNum - 1 - '0'] == 0) {
                    col[colNum - 1 - '0'] = 1;
                }

                if (sbNum != '.' && subBox[sbNum - 1 - '0'] != 0) {
                    return false;
                } else if (sbNum != '.' && subBox[sbNum - 1 - '0'] == 0) {
                    subBox[sbNum - 1 - '0'] = 1;
                }
            }
        }
        return true;
    }
}
