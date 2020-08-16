class NeonNo{

    static int  neonNo(int num){
        int sum = 0;
        while(num >0){
            int temp = num % 10;
            sum += temp;

            num = num/10;

        }
        return sum;
    }

    public static void main(String[] args) {

        int n =10;


        if( n == neonNo(n*n)){
            System.out.println(n +" is a neon number.");
        }else{
            System.out.println(n +" is not a neon number.");

        }
    }
}