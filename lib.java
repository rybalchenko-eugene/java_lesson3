import java.util.Scanner;
public class lib {

    public static int [][] new_board(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of columns: ");
        int col = in.nextInt();
        System.out.print("Input a number of rows: ");
        int row = in.nextInt();
        System.out.printf("Your board has measures: %d x %d \n", col, row);
        in.close();
        int [] [] board = new int [row+4][col+4];
        // Making margin
        for (int i = 0; i < board[0].length; i++) {
            board[0][i] = -1;
            board[1][i] = -1;
            board[row + 2][i] = -1;
            board[row + 3][i] = -1;
        }
        for (int i = 0; i < board.length; i++) {
            board[i][0] = -1;
            board[i][1] = -1;
            board[i][col + 2] = -1;
            board[i][col + 3] = -1;
        }
        board[2][2] = 1;
        return board;
    }
    
    public static int count_mov(int [][]b, int x, int y) {
        int count = 0;
        int [] mov1 = { -2, -1, 1, 2, 2, 1, -1, -2 };
        int [] mov2 = { 1, 2, 2, 1, -1, -2, -2, -1 };
        for (int i = 0; i < mov1.length; i++) {
            if (b[y + mov1[i]][x + mov2[i]] == 0) {
                count++;
            }
        }
        return count;
    }
}



