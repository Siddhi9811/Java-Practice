public class Q8 {
    public static void main(String[] args){
        String[] words = {"hello", "java", "world"};
        int[] nums = {10, 25, 7};

        // Reverse strings
        for(int i=0;i<words.length;i++){
            String rev = "";
            for(int j=words[i].length()-1;j>=0;j--){
                rev += words[i].charAt(j);
            }
            words[i] = rev;
        }

        // Find max number
        int max = nums[0];
        for(int n: nums){
            if(n>max) max=n;
        }

        // Printing final result
        for(String w: words){
            System.out.println("Reversed words are : " + w  + " " + "Maximum element is : "
             + max);
        }
    }
}

