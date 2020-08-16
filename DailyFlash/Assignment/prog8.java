class PrimeNo{

    void primeNo(int num){
        int count =0;
        for(int  i = 2;i <= num/2;i++)
        {
            if(num % i == 0)
            {
                count++;
                break;
            }
        }
        if (count == 0 && num !=1)
            System.out.println(num + " is a prime number.");

    }


    public static void main(String[] args) {
         int num =323;

            for(int a=num; a>0;a = a/10){

                int temp =a%10;
                PrimeNo obj = new PrimeNo();
                obj.primeNo(temp);
         


            }

    }
}