import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int team1Time = 0;    // 1번 팀 누적 이긴 시간
        int team2Time = 0;    // 2번 팀 누적 이긴 시간
        int scoreDiff = 0;
        int lastTime = 0;

        for (int i = 0; i < N; i++) {
            int team = sc.nextInt();
            String[] timeParts = sc.next().split(":");
            int currentTime = Integer.parseInt(timeParts[0]) * 60 + Integer.parseInt(timeParts[1]);

            if (scoreDiff > 0) {
                team1Time += (currentTime - lastTime);
            } else if (scoreDiff < 0) {
                team2Time += (currentTime - lastTime);
            }

            if (team == 1) scoreDiff++;
            else scoreDiff--;

            lastTime = currentTime;
        }

        int endTime = 48 * 60;
        if (scoreDiff > 0) {
            team1Time += (endTime - lastTime);
        } else if (scoreDiff < 0) {
            team2Time += (endTime - lastTime);
        }
        printTime(team1Time);
        printTime(team2Time);
    }

    private static void printTime(int totalSeconds) {
        int m = totalSeconds / 60;
        int s = totalSeconds % 60;
        System.out.printf("%02d:%02d\n", m, s);
    }
}