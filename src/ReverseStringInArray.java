import java.util.*;
public class ReverseStringInArray {
    public static void main(String[] args){
        char[] s = "reshma".toCharArray(); // Convert String to char array
        reverse(s);
        System.out.println(Arrays.toString(s));
        System.out.println(new String(s));

    }
    static void reverse(char[] s){
        int left=0,right=s.length-1;
        char temp;
        while(right>left) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }

}
