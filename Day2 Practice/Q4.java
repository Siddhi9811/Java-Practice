public class Q4{
    public static int findMax(int[]arr){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[]arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[]args){
        int[] numbers ={2,5,8,9,1};
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));



    }


}