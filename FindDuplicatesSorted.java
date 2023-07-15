import java.util.*;
public class FindDuplicatesSorted {
    
    public static void main(String[] args) {
        
        int arr[] = new int [] {4,3,2,7,8,2,3,1};

        findDups(arr);


    }

    public static void findDups(int arr[]) {

        Arrays.sort(arr);

        for(int i = 1; i < arr.length; i++) {
                if(arr[i]==arr[i-1]) {
                    System.out.println("duplicate elements are "+ arr[i]);
                }
        }
    }

}