class PerfectDivisors{

    public static void main(String[] args) {
        

        int num = 24;
        System.out.print("Perfect Divisors of 24 are: ");

        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                System.out.print( " " +i);
        }
    }
}