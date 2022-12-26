package Replits;

public class UniqueNumbers {

    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};


        for (int i = 0; i < nums.length; i++) {
            int w = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if(nums[j] == w){
                    count++;
                }

            }
            if(count == 1){
                System.out.println(w);
            }
        }


    }
}
