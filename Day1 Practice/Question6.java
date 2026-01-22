public class Question6 {
    public static void main(String[] args) {
        int num=7;
        int count = 0;
        if(num<=1){
            System.out.println("Not a Prime number. ");
        }else{
            for(int i=2;i*i<=num;i++){
                if(num %i==0){
                    count++;
                    break;


                }
            }
        if(count==0){
            System.out.println(num + " is a Prime number");
        }else {
            System.out.println(num + " is not  a Prime number");
        }
    }
}
}