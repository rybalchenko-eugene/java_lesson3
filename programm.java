import javax.lang.model.util.ElementScanner6;

/**
 * lesson3 all the same
 */
public class programm {

    public static void main(String[] args) {
        
        
        int [][] lst = {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                        {-1,0,0,0,0,0,-1,0,0,-1,0,-1},
                        {-1,0,0,-1,0,0,-1,0,0,0,0,-1},
                        {-1,0,0,0,0,0,0,0,-1,0,0,-1},
                        {-1,-1,0,0,-1,-1,-1,-1,-1,0,0,-1},
                        {-1,-1,0,0,0,0,-1,0,-1,0,0,-1},
                        {-1,0,0,0,-1,0,0,-1,-1,0,0,-1},
                        {-1,0,0,0,-1,0,0,0,-1,0,0,-1},
                        {-1,0,0,0,-1,0,0,0,0,0,0,-1},
                        {-1,0,0,0,0,-1,0,0,0,0,0,-1},
                        {-1,0,-1,-1,0,-1,0,0,0,0,0,-1},
                        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                    };
        int pos_x = 1;
        int pos_y = 1;
        print(lst);
        wave(lst, pos_x, pos_y, 1);
        print2(lst);
    }
    public static void print(int [][]lst) {
        for (int i = 0; i < lst.length; i++) {
            for (int j = 0; j < lst[i].length; j++) {
                if (lst[i][j] == -1) {
                    System.out.print("███");
                }
                else if (lst[i][j] == 0)
                System.out.print("   ");
            }
            System.out.println();
        }
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
    public static void wave(int [][]b, int x, int y, int step) {
        b[x][y] = step;
        if (b[x][y - 1] == 0) wave(b, x, y - 1, step +1);
        if (b[x + 1][y] == 0) wave(b, x + 1, y, step +1);
        if (b[x][y + 1] == 0) wave(b, x, y + 1, step +1);
        if (b[x - 1][y] == 0) wave(b, x - 1, y, step +1);
        }
    public static void wave2(int [][]b, int x, int y, int step) {
        b[y][x] = step;
        
        if (b[y][x + 1] == 0) wave(b, x + 1, y, step +1);
        if (b[y - 1][x] == 0) wave(b, x, y - 1, step +1);
        if (b[y + 1][x] == 0) wave(b, x, y + 1, step +1);
        if (b[y][x - 1] == 0) wave(b, x - 1, y, step +1);
        }
}
