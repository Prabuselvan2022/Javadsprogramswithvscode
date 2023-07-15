import java.util.*;
public class reverseArray {
    
    public static void main(String[] args) {
        
        int arr[] = new int[]{1,2,3,4};

        int start = 0;
        int end = arr.length-1;

        while (start < end) { 
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            
        }

        System.out.println(Arrays.toString(arr));
    }
}
