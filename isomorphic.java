import java.util.Arrays;

public class isomorphic {

    public static void main(String[] args) {
        

    }

    public static String isIsomorphic(String str1, String str2) {

        int arr[] = new int [256];
        Arrays.fill(arr, -1);

        Boolean isMarked[] =new Boolean[256];
        Arrays.fill(isMarked, -1);


        for (int i = 0; i < str1.length(); i++) {

            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if(arr[i] == -1) { 
                if(isMarked[ch1] == true) { 
                    return "True";
                }

                isMarked[ch2]=true;
                arr[ch1]=ch2;
            }else if(arr[ch1]!= ch2 ) {
                    return "False";

            }

        }

        return "True";
    }
}