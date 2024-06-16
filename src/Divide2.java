import java.util.*;
public class Divide2 {
    static int n,k;
    static int arr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 n과 k를 입력");
        n = sc.nextInt();
        k = sc.nextInt();

        arr=new int[n];
        int [] temp = new int[k];
        for (int i=1; i<=n; i++)
            arr[i-1] = i;
        dfs(0,0,temp);
    }
    public static void dfs(int cnt, int idx, int[] temp){
        if (cnt==k){
            System.out.println(Arrays.toString(temp)+" ");
            return;
        }
        for (int i = idx; i<n; i++){
            temp[cnt] = arr[i];
            dfs(cnt+1,i+1,temp);
        }
    }
}
