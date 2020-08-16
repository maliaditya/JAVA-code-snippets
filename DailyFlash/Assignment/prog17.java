class PrimeNumber{

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
         int num =13;
        PrimeNo obj = new PrimeNo();
        obj.primeNo(num);
         


            }

    }
