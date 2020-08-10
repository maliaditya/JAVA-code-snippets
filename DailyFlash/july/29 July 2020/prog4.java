class Divi{

    static boolean isDivisible(int dividend,int divisor){

        return ((dividend ^ 1) == dividend + 1);
        
    }
    public static void main(String[] args) {
        int dividend = 8;
        int divisor = 2; 
        
        
        if(isDivisible(dividend, divisor)){
            System.out.println("YES");
        } else{
            System.out.println("No");
        }
    }
}