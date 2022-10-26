/**
 * lesson3 all the same
 */
public class programm {

    public static void main(String[] args) {
        int [][] lst = {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                        {-1,1,0,0,0,0,-1,0,0,-1,0,-1},
                        {-1,0,0,-1,0,0,-1,0,0,0,0,-1},
                        {-1,0,0,0,0,0,0,0,-1,0,0,-1},
                        {-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0,-1},
                        {-1,-1,0,0,0,0,-1,0,0,0,0,-1},
                        {-1,0,0,0,-1,0,0,0,-1,0,0,-1},
                        {-1,0,0,0,-1,0,0,0,-1,-1,-1,-1},
                        {-1,0,0,0,-1,0,0,0,0,0,0,-1},
                        {-1,0,0,0,0,-1,0,0,0,0,0,-1},
                        {-1,0,-1,-1,0,-1,0,0,0,0,0,-1},
                        {-1,0,0,-1,0,0,-1,-1,-1,-1,0,-1},
                        {-1,0,0,-1,0,0,-1,0,0,0,0,-1},
                        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                    };
        
        int [] path = new int [30];
        path[0] = 1;
        path[1] = 1;

        wave(lst, path);

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

    public static void wave(int [][]b, int [] path) {
            while (path[0] != 0) {
                int x = path[0];
                int y = path[1];
                int start = b[y][x];
                remove(path);
                if (b[y][x - 1] == 0) {
                    b[y][x - 1] = start +1;
                    add(path, x -1 , y);
                }
                if (b[y + 1][x] == 0) 
                {
                    b[y + 1][x] = start +1;
                    add(path, x, y + 1);
                }
                if (b[y][x + 1] == 0) {
                    b[y][x + 1] = start +1;
                    add(path, x + 1, y);
                }
                if (b[y - 1][x] == 0) {
                    b[y - 1][x] = start +1;
                    add(path, x, y - 1);
                }
            }  
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
