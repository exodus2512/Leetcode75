// Longest Substring Without Repeating Characters problem:3
import java.util.*;
class substring{
public static void main(String args[]){
   
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.print(substring1(s));
    sc.close();

}

public static int substring1(String s){
    HashSet<Character> set = new HashSet<>();
    int left = 0;
    int maxLength=0;

    for(int right=0;right<s.length();right++){
       set.add(s.charAt(right));
        while(set.contains(s.charAt(right))) {
            set.remove(s.charAt(right));
            left++;
        }
       
             maxLength = Math.max(maxLength,right-left+1);
          }
          return maxLength;
}
    }