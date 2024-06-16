public class Divide1 {
    public int[]ans = new int[2];
    public int[] solution(int[][] arr) {
        div(arr, 0,0, arr.length);
        return ans;
    }
    public void div(int[][] arr, int x, int y, int length){
        if (search(arr, x, y, length)){
            ans[arr[x][y]]++;
        }
        else {
            length=length/2;
            div(arr, x,y,length);
            div(arr, x+length,y,length);
            div(arr, x,y+length,length);
            div(arr, x+length+length,y,length);
        }
    }
    public boolean search(int [][] arr, int x, int y, int length){
        int c = arr[x][y];
        for (int i = x; i < x + length; i++){
            for (int j = y; j<y+length; j++){
                if (arr[i][j] != c){
                    return false;
                }
            }
        }
        return true;
    }
}
