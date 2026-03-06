public class BinarySearchAscendingOrder {
    public static void main(String[] args) {
    int[] arr = {1,8,12,15,20,24,36,42,58};
    int target = 20;
    int ans = binarysearch(arr, target);
    System.out.println(ans);
    }

    static  int binarysearch(int[] arr, int target){
        // step 1 - set start, end and middle element
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
//            int mid = (start + end) /2 ; // this will cause error when large input is taken
            int mid = start + (end - start) / 2;

            // check for target and adjust start, mid, end element
            if(target < arr[mid]){ // left side search
                end = mid -1;
            } else if (target > arr[mid]) { // right side search
                start = mid +1;
            }
            else{ // target == mid --> result
                return mid;
            }
        }
        return -1;
    }
}

/*
 Steps:
 1. set start, end and middle element.
 2. adjust start, mid, end element
 */
