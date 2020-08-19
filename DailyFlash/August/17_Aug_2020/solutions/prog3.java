class EvenOrOdd{

    static void evenOrOdd(int num){
        if (num%2==0){
            System.out.printf("%d is the Even number.", num);

        }else{
            System.out.printf("%d is the Odd number.", num);

        }
    }

    public static void main(String[] args) {
        
        int num = 4;

        evenOrOdd(num);
    }
}