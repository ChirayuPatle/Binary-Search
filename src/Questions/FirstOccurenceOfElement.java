package Questions;

public class FirstOccurenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1,1,5,6,6,7,7,7,7,8,9,10};
        int target = 7;
        int result = searchfirstoccurence(arr, target);
        System.out.println(result);
    }
    static int searchfirstoccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

             if(target == nums[mid]){
                end = mid -1;
                while(target <= nums[mid]){
                    if(target < nums[mid]){
                        end = mid -1;
                    } else if (target > nums[mid]){
                        start = mid +1;
                    }
                    else {
                        return mid;
                    }
                    return -1;
                }
            }

            if(target < nums[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
    }
        return -1;
}
}
