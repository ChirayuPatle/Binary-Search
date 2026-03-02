public class BinarySearchDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {58, 42, 36, 24, 20, 15, 12, 8, 1};
        int target = 15;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static  int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){ // right search
                start = mid  + 1;
            } else if (target > arr[mid]) { // left search
                end = mid + -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
