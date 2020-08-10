class WhileDemo2 {


    public static void main(String[] args) {
        
        int sum=0;

        for(int num = 135,rem = 0, counter = 0; num>0 || counter > 2  ; ){
            rem = num%10;
            sum = sum + rem;
            num = num /10;
        }

        System.out.println("sum: "+sum);


    }

    
}