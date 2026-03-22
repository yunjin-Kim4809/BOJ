import java.util.Scanner;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_num = sc.nextInt();
        int cmd = sc.nextInt();
        int a,l,r;
        int[] arr = new int[arr_num];
        for (int i = 0 ; i < arr_num ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < cmd ; i++) {
            a = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            switch (a) {
                case 1:
                    arr[l-1] = r;
                    break;
                case 2:
                    for(int j = l-1 ; j < r ; j++) {
                        if (arr[j] == 0) arr[j] = 1;
                        else arr[j] = 0;
                    }
                    break;
                case 3:
                    for(int j = l-1 ; j < r ; j++) {
                        arr[j] = 0;
                    }
                    break;
                case 4:
                    for(int j = l-1 ; j < r ; j++) {
                        arr[j] = 1;
                    }
                    break;
            }
        }
        for(int i = 0 ; i < arr_num ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}