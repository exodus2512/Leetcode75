import java.util.*;
public class LCS_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int m = str1.length();
        int n = str2.length();
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int[][] mat = new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                  if(s1[i-1]==s2[j-1]){
                      mat[i][j] = mat[i-1][j-1] + 1;
                  }else{
                      mat[i][j] = Math.max(mat[i-1][j], mat[i][j-1]);
                  }
            }
        }
        System.out.println(mat[m][n]);
    }
    
}
