class PalindromeNo{

    int reversedInt(int num){
        int reversedInteger =0;
        while(num>0){

            int remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        return reversedInteger;
    }

    public static void main(String[] args) {
        int n =121;
        PalindromeNo obj =new PalindromeNo();
        if( n == obj.reversedInt(n))
            System.out.println(n + " is a palindrome.");
        else
            System.out.println(n + " is not a palindrome.");
    }


        
        
    
}