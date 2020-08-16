/**
 * 
 Program 2: Write a code in Java, to find Greatest Common Divisor (GCD) of two given
numbers
 */

 

class PerfectNo{


    public static void main(String[] args) {
        
        int num = 496;
        int sum =0;
        for(int i=1;i<num;i++){
            if(num%i == 0 ){
                sum = sum +i;
            } 
    }
    if (sum == num)
        System.out.println(sum + " is a perfect number");
    else
        System.out.println(num + " is not a perfect number");

    }
 }