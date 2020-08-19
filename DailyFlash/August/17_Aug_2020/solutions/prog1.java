class MaxNumber{

    int maxNumber(int num1,int num2) {

        if( num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;

        MaxNumber findMax = new MaxNumber();
        int max = findMax.maxNumber(num1, num2);

        System.out.printf("%d is Max Number among %d & %d",max,num1,num2);

        
    }
}