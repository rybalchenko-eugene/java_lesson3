/**
 * lesson3 all the same
 */
public class programm {

    public static void main(String[] args) {
        int [][] lst = lib.new_board();              
        
        int [] path = new int [128];
        path[0] = 2;
        path[1] = 2;

        wave(lst);

        System.out.println("programm.main()");
        print2(lst);
        System.out.println("");
    }

    public static void print2(int [][]lst) {
        for (int i = 0; i < lst.length; i++) {
            for (int j = 0; j < lst[i].length; j++) {
                if (lst[i][j] == -1) {
                    System.out.print("███");
                }
                else if (lst[i][j] / 10 > 0) {
                    System.out.print(" " + lst[i][j]);
                }
                else System.out.print("  " + lst[i][j]);
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
                    if  (count_mov(b, x + mov2[j], y + mov1[j]) < min) {
                        min = count_mov(b, x + mov2[j], y + mov1[j]);
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

    public static void add(int []lst, int x, int y) {
        for (int i = 0; i < lst.length-2 ; i++) {
            if (lst[i] == 0) {
                lst[i] = x;
                lst[i+1] = y;
                break;
            }
        }
    }

    public static void remove(int []lst) {
        for (int i = 0; i < lst.length-3; i++) {
            lst[i] = lst[i+2];
        }
    }
}
