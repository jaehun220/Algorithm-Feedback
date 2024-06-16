//public class Dynamic1 {
//    public int solution(int[][] triangle){
//        int answer = 0;
//        int n = triangle.length;
//        int [][] sum = new int[][];
//        for (int i = 1; i<n; i++){
//            for (int j = 0; j<n; j++){
//                if (j==0){
//                    sum[i][j] = triangle[i][j]+triangle[i-1][j];
//                }
//                else if (j==i){
//                    sum[i][j] = triangle[i][j]+triangle[i-1][j-1];
//                }
//                else {
//                    sum[i][j] = triangle[i][j] + Math.max(sum[i-1][j], sum[i-1][j-1]);
//                }
//            }
//        }
//        for (int j = 0; j<n; j++){
//            answer=Math.max(answer,sum[n-1][j]);
//        }
//        return answer;
//    }
//}
