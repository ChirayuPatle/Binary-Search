public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {58, 42, 36, 24, 20, 15, 12, 8, 1};
        int[] arr = {1,8,12,15,20,24,36,42,58};
        int target = 15;
        int ans = binarysearch(arr, target);
        System.out.println("Element found at index: " + ans);
    }
    static int binarysearch(int[] arr, int target){
        int start = 0 ;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end -start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
