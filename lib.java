import java.util.Scanner;
public class lib {

    public static int [][] new_board(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of column: ");
        int col = in.nextInt();
        System.out.print("Input a number of column: ");
        int row = in.nextInt();
        System.out.printf("Your board has measures: %d x %d \n", col, row);
        in.close();
        int [] [] board = new int [row+4][col+4];
        for (int i = 0; i < row+4; i++) {
            board[0][i] = -1;
            board[1][i] = -1;
            board[col + 2][i] = -1;
            board[col + 3][i] = -1;
            board[i][0] = -1;
            board[i][1] = -1;
            board[i][row + 2] = -1;
            board[i][row + 3] = -1;
        }
        board[2][2] = 1;
        return board;
    }
}



