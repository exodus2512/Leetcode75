import java.util.*;
public class anagram {

    public static void main (String args[]){
        String str1 = "program";
        String str2 = "ropaarm";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        if(arr1.length!=arr2.length)System.out.println("Not Anagra,");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)){
                System.out.print("Anagram");
            }
            else{
                System.out.print("Not Anagram");
            }

    }
    
}
