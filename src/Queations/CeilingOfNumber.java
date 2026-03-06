package Queations;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={4,5, 8, 10, 15, 38};
        int target = 16;
        int result = ceilingofnumber(arr, target);
        System.out.println(result);

    }
    static int ceilingofnumber(int[] arr, int target){
        // start, end, mid
        int start = 0;
        int end  = arr.length - 1;
        while(start <= end){
            boolean asc = arr[start] < arr[end];
            int mid = start + (end- start)/2;

            // ceiling logic -> mid |||| mid || mid+1 (asc) |||| mid  || mid -1
            if(target == arr[mid]){
                return mid;
            }

            if(asc){
                if(target > arr[mid]){
                    start = mid +1;
                }else if(target < arr[mid]){
                    end = mid -1;
                }
                else if(start == end){
                    return mid+1;
                }
            } else{
                if(target < arr[mid]){
                    start = mid +1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }
//                else{
//                    return arr[mid-1];
//                }
            }
            return arr[mid +2];
        }
        return -1;
    }
}
