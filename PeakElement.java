public class PeakElement {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l<r) {
            
        
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        PeakElement obj = new PeakElement();
        int[] nums = {2,2,2,2,2};
        System.out.println("Peak index: " + obj.findPeakElement(nums));
    }
}
// public class PeakElement {
//     public int findPeakElement(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             if ((i == 0 || nums[i] > nums[i - 1]) &&
//                 (i == nums.length - 1 || nums[i] > nums[i + 1])) {
//                 return i; // peak found
//             }
//         }
//         return -1; // never reached
//     }

//     public static void main(String[] args) {
//         PeakElement obj = new PeakElement();
//         int[] nums = {1,2,1,3,4,6,5};
//         System.out.println("Peak index: " + obj.findPeakElement(nums));
//     }
// }


