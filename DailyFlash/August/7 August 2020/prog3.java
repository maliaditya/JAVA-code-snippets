class Divisible{

    public static void main(String[] args) {
        
        int num2=1,count=0;

        while(count<=10){
            if((num2%7==0) &&( num2 %32 ==0) && (num2%6 ==0)){
                System.out.println();
                System.out.println("Breaking the Loop");
                System.out.println(num2 + " is divisible by 6");

                break;
            } else if((num2%7==0) &&( num2 %32 ==0)){
                    System.out.print(num2 + " ");
                    num2++;
                    count++;
            } else{
                num2++;
            }
        }
    }
}