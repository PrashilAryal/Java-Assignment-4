public class Ques5 {
    public void permutation(){
        int[] nums = {0, 2, 1, 5, 3, 4};
        int length = nums.length;
        int[] ans = new int[length];
        int i;
        int k;
        System.out.println("ZERO-BASED PERMUTATION");
        System.out.print("Input is: ");
        for(i=0;i<length;i++){
            System.out.print(nums[i]+" ");
            ans[i]=nums[nums[i]];
        }
        System.out.print("\nResult: ");
        for(k=0;k<length;k++){
            System.out.print(ans[k]+" ");
        }
    }
}
