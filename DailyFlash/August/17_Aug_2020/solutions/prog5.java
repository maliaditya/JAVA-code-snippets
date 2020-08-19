class DivisibleBy5and11{

    static boolean divisibleBy5and11(int num){
      
        if((num%5==0) && (num%11==0)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        int num = 55;

        boolean istrue = divisibleBy5and11(num);

        if(istrue == true){
            System.out.printf("%d is divisible by 5 & 11.",num);
        }else{
            System.out.printf("%d is not divisible by 5 & 11.",num);

        }
    }
}