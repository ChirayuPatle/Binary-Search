package Questions;

public class MountainArray {
    public static void main(String[] args) {
            int[] arr = {1,8,12,15,20,24,36,42,58};
            int ans = peakIndexInMountainArray(arr);
            System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}
