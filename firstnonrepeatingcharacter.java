import java.util.*;
public class firstnonrepeatingcharacter {

    public static void main(String[] args) {

        String str= "aaabcccdeeef";

        System.out.println("indexOf is "+ str.indexOf('d'));
        System.out.println("lastindexof is "+ str.lastIndexOf('d'));

        // char ch= findnonrepeating3(str);
        // System.out.println("output is --> "+ ch);

        
    }
    
    // brute force approach
    public static Character findnonrepeating(String str) {

        for(int i=0; i<str.length(); i++)   {
            boolean seenduplicate=false;
            char ch1 = str.charAt(i);
            for (int j=0; j<str.length(); j++) {
                char ch2 = str.charAt(j);
                    if(ch1==ch2 && i!=j) {
                            seenduplicate=true;
                            break;
                    }
            }

            if(!seenduplicate) {
                    System.out.println("output "+ str.charAt(i));

                    return str.charAt(i);
            }
        }
        return '_';
    }


    public static Character findnonrepeating1(String str) {

        Map<Character,Integer> hmap = new HashMap<Character,Integer>();

        for (int i=0; i<str.length(); i++  ) {

            char ch= str.charAt(i);
                if(hmap.containsKey(ch)) {
                    hmap.put(ch,hmap.get(ch)+1);
                } else {
                    hmap.put(ch,1);
                }
        }

        for (Map.Entry<Character,Integer> newmap: hmap.entrySet()) {
            if(newmap.getValue()==1) {
                System.out.println("newmap.getkey() --> "+newmap.getKey());

                return newmap.getKey();
            }
        }

        return'_';
    }

    public static Character findnonrepeating2(String str) {

        int char_Counts[] = new int[26];


        char[] charval= str.toCharArray();

        for(char c: charval) {
            char_Counts[c-'a']++;
        }

        for (char c:charval ) {
            if(c-'a'==1) {
                System.out.println("op -->"+ c);
                return c;
            }
        }
      return '_';
    }

    public static Character findnonrepeating3(String str) {

        for(int  i=0; i<str.length(); i++) {
            char ch=  str.charAt(i);

            if(str.indexOf(ch)==str.lastIndexOf(ch)) {
                System.out.println("output --> " +str.charAt(i));
                return str.charAt(i);
            }
        }

        return '_';
    }
}
