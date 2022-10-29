/**
 * lesson3 all the same
 */
public class programm {

    public static void main(String[] args) {
        int [][] lst = lib.new_board();              
        print2(lst);
        int [] path = new int [128];
        path[0] = 2;
        path[1] = 2;

        wave(lst);

        System.out.println("programm.main()");
        print2(lst);
        System.out.println("");
    }

    public static void print2(int [][]lst) {
        int flag = 1;
        for (int i = 0; i < lst.length; i++) {
            flag = i%2 == 0? 1 : -1;

            for (int j = 0; j < lst[0].length; j++) {
                if (lst[i][j] == -1) {
                    if (flag == 1) {                    
                    System.out.print("███");
                    flag *=-1;
                    }
                    else {
                        System.out.print("   ");
                        flag *=-1;
                    }
                }
                else if (lst[i][j] / 10 > 0) {
                    System.out.print(" " + lst[i][j]);
                    flag *=-1;
                    }
                    else {
                        System.out.print("  " + lst[i][j]);
                        flag *=-1;
                    }
            }
            System.out.println();
        }
    }

    public static void wave(int [][]b) {
        int [] mov1 = { -2, -1, 1, 2, 2, 1, -1, -2 };
        int [] mov2 = { 1, 2, 2, 1, -1, -2, -2, -1 };
        int count = 1;
        int x = 2;
        int y = 2;
        int opt_move = 7;
        while (count != (b.length-4)*(b[0].length-4)) { // While limit of mvmts is not empty 
            int min = 8;
            for (int j = 0; j < mov1.length; j++) {
                if (b[y + mov1[j]][x + mov2[j]] == 0) {
                    if  (lib.count_mov(b, x + mov2[j], y + mov1[j]) < min) {
                        min = lib.count_mov(b, x + mov2[j], y + mov1[j]);
                        opt_move = j; // Pick the opt_move by min of variants
                    }            
                }
            }
            count++;
            if (count < (b.length-4)*(b[0].length-4) && min ==0){ // Check 
                System.out.println("Solution has not been founded((");
                break;
            }
            else {
            // Movement to the opt_spot
            x = x + mov2[opt_move]; 
            y = y + mov1[opt_move];
            b[y][x] = count;
            }
        }
    }



}
