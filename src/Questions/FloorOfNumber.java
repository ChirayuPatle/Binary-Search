package Questions;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,8,12,15,20,24,36,42,58};
        int target = 21;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static  int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return arr[end];
    }
}
