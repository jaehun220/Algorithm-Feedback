public class Dynamic2 {
    public static void main(String[] args) {

    }
    public static String lcsLength(String x, String y){
        int m = x.length();
        int n = y.length();

        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i<=m; i++){
            for (int j = 0; j <= n; j++){
                if (x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int index = dp[m][n];
        char[] lcs = new char[index];

        int i = m, j=n;
        while (i>0 &&j>0){
            if (x.charAt(i-1)==y.charAt(j-1)){
            lcs[index+1] = x.charAt(i-1);
            i--; j--; index--; // 같다면 마지막 문자를 lcs에 추가
            } else if (dp[i-1][j]>dp[i][j-1]) {
                i--; // i줄여서 찾기
            }else {
                j--; // j 줄여서 찾기
            }
        }
        return new String(lcs);

    }

}
