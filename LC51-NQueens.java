class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for(char[] c : board) {
            Arrays.fill(c, '.');
        }

        HashSet<Integer> column = new HashSet();
        HashSet<Integer> posDiag = new HashSet();
        HashSet<Integer> negDiag = new HashSet();

        backtrack(n, result, board, column, posDiag, negDiag, 0);

        return result;
    }

    private void backtrack(int size, List<List<String>> result, char[][] board, HashSet<Integer> column, HashSet<Integer> posDiag, HashSet<Integer> negDiag, int row) {
        //Combination found
        if(row == size) {
            result.add(createBoard(board));
            return;
        }

        for(int col = 0; col < size; col++) {
            if(column.contains(col) || posDiag.contains(row + col) || negDiag.contains(row - col)) {
                continue;
            }

            board[row][col] = 'Q';
            column.add(col);
            posDiag.add(row + col);
            negDiag.add(row - col);

            backtrack(size, result, board, column, posDiag, negDiag, row + 1);

            board[row][col] = '.';
            column.remove(col);
            posDiag.remove(row + col);
            negDiag.remove(row - col);
        }
    }

    private List<String> createBoard(char[][] board) {
        List<String> oneDimensionalBoard = new ArrayList<>();
        for(char[] c : board) {
            oneDimensionalBoard.add(new String(c));
        }

        return oneDimensionalBoard;
    }
}