public class Question10 {
    public static void main(String[] args) {
        int[] arr ={ 1,2,3,4,5};
        int sum=0;
        for(int i=0; i < arr.length; i++){
            if(arr[i]%2==0){
                System.out.println("Even");
                sum=sum+arr[i];
            }else {
                System.out.println("Odd");
            }

        }
        System.out.println("The Sum of Even numbers is : " + sum);
    }
}
