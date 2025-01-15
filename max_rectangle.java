import java.util.*;

public class max_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int maxarea = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    System.out.println(i + " " + j);
                    int height = 0;
                    int width = Integer.MAX_VALUE;
                    for (int k = i; k < n && mat[k][j] == 1; k++) {
                        int w = 0;
                        int l = j;
                        while (l < m && mat[k][l] == 1) {
                            l++;
                            w++;
                        }
                        width = Math.min(w, width);
                        height++;
                        int area = height * width;
                        maxarea = Math.max(maxarea, area);
                        System.out.println(maxarea);
                    }
                }
            }
        }
        System.out.println(maxarea);

    }
}
