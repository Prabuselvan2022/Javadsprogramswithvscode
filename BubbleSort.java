import java.util.*;
public class BubbleSort {
    
    public static void main(String[] args) {
        int arr[] = { 75,100,3,300,13,1,100};

        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) { 
                if(arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Array --> "+ Arrays.toString(arr));

    }


}
