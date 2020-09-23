// Citadel Interview Problem

class Matrixreverseaddition {
    public static void main(String[] args) {
        int[][] num = { { 26, 26, 33, 13, 88, 61, 44, 58, 45 }, { 9, 7, 90, 36, 15, 20, 76, 44, 5 },
                { 19, 28, 64, 92, 10, 93, 53, 38, 26 }, { 32, 87, 28, 98, 86, 70, 30, 3, 44 },
                { 61, 22, 20, 18, 50, 96, 2, 36, 1 } };
        int[][] dp = new int[num.length][num[0].length];
        dp[0][0] = num[0][0];
        for (int i = 1; i < num[0].length; i++) {
            dp[0][i] = num[0][i] - num[0][i - 1];
        }

        for (int i = 1; i < num.length; i++) {
            dp[i][0] = num[i][0] - num[i - 1][0];
        }

        for (int i = 1; i < num.length; i++) {
            for (int j = 1; j < num[0].length; j++) {
                int temp = 0;
                for (int k = 0; k < i; k++) {
                    temp += dp[k][j];
                }
                dp[i][j] = num[i][j] - (num[i][j - 1] + temp);
            }
        }

        for (int[] ints : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}