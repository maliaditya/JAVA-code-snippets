class NoPosOrNeg{

    static void positiveOrNegative(int num){

        if(num<0){
            System.out.printf("%d is the negative number.", num);
        }else if(num>0){
            System.out.printf("%d is the positive number.", num);

        }else{
            System.out.printf("%d is equals to zero.", num);

        }

    }

    public static void main(String[] args) {

        int num = -2;
         
        positiveOrNegative(num);
    }
}