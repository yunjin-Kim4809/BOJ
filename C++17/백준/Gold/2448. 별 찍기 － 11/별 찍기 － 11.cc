#include <iostream>
#include <vector>

using namespace std;
char board[3072][6144];

void drawStars(int n, int x, int y) {
    // 1. base
    if (n == 3) {
        board[x][y] = '*';
        board[x + 1][y - 1] = '*';
        board[x + 1][y + 1] = '*';
        for (int i = 0; i < 5; i++) {
            board[x + 2][y - 2 + i] = '*';
        }
        return;
    }

    // 2. 재귀 호출
    int nextN = n / 2;
    drawStars(nextN, x, y);                   // 위쪽
    drawStars(nextN, x + nextN, y - nextN);   // 왼쪽 아래
    drawStars(nextN, x + nextN, y + nextN);   // 오른쪽 아래
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 2 * n; j++) {
            board[i][j] = ' ';
        }
    }

    drawStars(n, 0, n - 1);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 2 * n - 1; j++) {
            cout << board[i][j];
        }
        cout << '\n';
    }

    return 0;
}