import java.util.*;
public class RevStringinArray2 {
    public static void main(String[] args){
        char[] s = "hello".toCharArray();

        reverse(s); // Call the static reverse method directly
        System.out.println(new String(s));


    }
    static void reverse(char[] s){
        int left=0,right=s.length-1;
        while(right<left){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }


}
