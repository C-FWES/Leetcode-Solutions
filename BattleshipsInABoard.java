public class BattleshipsInABoard {
    public static void main(String[] args) {
        char[][] board = new char[3][4];
        board[0] = new char[]{'X', '.', '.', 'X'};
        board[1] = new char[]{'.', '.', '.', 'X'};
        board[2] = new char[]{'.', '.', '.', 'X'};
        int battleships = countBattleships(board);
        System.out.println(battleships);
    }

    public static int countBattleships(char[][] board) {
        int shipCount = 0;
        int boardLength = board.length;
        int boardWidth = board[0].length;
        for (int i = 0; i < boardLength; i++) {
            for (int j = 0; j < boardWidth; j++) {
                boolean adjacentiNotEmpty = i == 0 || board[i - 1][j] != 'X';
                boolean adjacentjNotEmpty = j == 0 || board[i][j - 1] != 'X';
                if (board[i][j] != '.' && adjacentiNotEmpty && adjacentjNotEmpty) {
                    shipCount++;
                }
            }
        }
        return shipCount;
    }
}
