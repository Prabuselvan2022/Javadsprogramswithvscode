import java.util.ArrayList;
import java.util.List;

class FindDuplicates {
    public static void main(String[] args) {
        int arr[] =new int[] {4,3,2,7,8,2,3,1};

        findDup(arr);

    }

    public static List<Integer> findDup(int arr[]) {
        List<Integer> result = new ArrayList<Integer>();

        // for(int val: arr) {
        //     System.out.println("val --> "+ val);
        //     val = Math.abs(val);
        //     // System.out.println("arr[val-1] --> " + arr[val-1]);
        //     if(arr[val-1]>0) {
        //         arr[val-1]*=-1;
        //     } else {
        //         result.add(val);
        //     }
        // }

        for (int i = 0; i < arr.length; i++) {
            int temp = Math.abs(arr[i]);
            System.out.println("temp --> "+temp);
            System.out.println("arr[temp-1] --> "+ arr[temp-1]);
            int val=arr[temp-1];
            if(val> 0) {
                arr[temp-1]=arr[temp-1]*-1;
            }else {
                result.add(temp);
            }
        }
        // System.out.println(result.toArray());
        System.out.println(result);
        return result;
    }
}