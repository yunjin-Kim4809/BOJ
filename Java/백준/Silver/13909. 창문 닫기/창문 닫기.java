import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long count = 0;
        for (long i = 1 ; i*i <= num ; i++) {
            count++;
        }
        System.out.print(count);
    }
}