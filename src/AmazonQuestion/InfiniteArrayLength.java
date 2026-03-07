package AmazonQuestion;

public class InfiniteArrayLength {
    public static void main(String[] args) {
        int[] arr = {1,8,12,15,20,24,36,42,58};
        int target = 20;
        int ans = findChunks(arr, target);
        System.out.println(ans);
    }

    static int findChunks(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newstart = end +1;
            end = end + (end - start +1)*2;
            start = newstart;
        }
        return binarysearch(arr, target, start, end);
    }

    static  int binarysearch(int[] arr, int target, int start, int end){
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
        return -1;
    }
}
