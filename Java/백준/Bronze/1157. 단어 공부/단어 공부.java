import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int arr[] = new int[32];
        int num;
        int max = 0;
        for (int i = 0 ; i < str.length() ; i++) {
            char a = str.charAt(i);
            if (a >= 97 && a <= 122) {
                a = (char)(a - 32);
            }
            num = (int) a - 65;
            arr[num] ++;
            if (arr[num] > max) max = arr[num];
        }
        int cnt = 0;
        int idx = -1;
        for (int i = 0 ; i < 32 ; i++) {
            if (arr[i] == max) {
                cnt ++;
                idx = i;
            }
        }
        if (cnt == 1) {
            char k = (char)(idx + 65);
            System.out.println(k);
        }
        else {
            System.out.println("?");
        }

    }
}