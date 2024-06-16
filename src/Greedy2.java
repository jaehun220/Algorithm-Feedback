import java.util.*;
public class Greedy2 {
    public int solution(int[][] routes) {
        int answer = 0;
        //끝나는 점을 기준으로 정렬을 한다 (겹치는데 카메라 설치)
        //이후 다음 시작점을 본다(시작점이 커버가 되면 설치안해도 됨)
        //다음 시작점이 커버가 안되면 다음 경로의 마지막에 설치
        //반복
        int lastPostion = routes[0][1];
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        for (int i =0; i<routes.length; i++){
            if (lastPostion<routes[i][0]){
                lastPostion=routes[i][0];
                answer++;
            }
        }
        return answer;
    }
}
