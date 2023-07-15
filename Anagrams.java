import java.util.*;
public class Anagrams {
    
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";
        System.out.println(isAnagram(str1, str2));
    }

    public static Boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2= str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       for (int i=0; i<ch1.length; i++) {
            if(ch1[i]!=ch2[i]) {
                return false;
            }
       }
        return true;
    }
}
