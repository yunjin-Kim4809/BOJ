import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int find_num = sc.nextInt();

        int[][] arr = new int[n][n];

        int num = n*n;
        int chk = 0;
        while(num >= 1) {
            for(int y = chk ; y < n-chk ; y++) {
                arr[y][chk] = num;
                num--;
            }
            for(int x = chk+1 ; x < n-chk ; x++) {
                arr[n-chk-1][x] = num;
                num--;
            }
            for(int y = n - chk - 2 ; y>= chk ; y--) {
                arr[y][n-chk-1] = num;
                num--;
            }
            for (int x = n- chk -2 ; x > chk ; x--) {
                arr[chk][x] = num;
                num--;
            }
            chk++;
        }
        int find_x = 0, find_y = 0;

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == find_num) {
                    find_x = i;
                    find_y = j;
                }
            }
            System.out.println();
        }
        find_x++;
        find_y++;
        System.out.print(find_x + " " + find_y);
    }
}