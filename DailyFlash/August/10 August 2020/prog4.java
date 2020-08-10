
class Factorial{
    public static void main(String[] args) {
        int i, num= 10,fact=1;

        for (i=1;i<=num;i++){
             for(int j=i;j>=1;j--){
             fact = fact * j;
            }
        System.out.println("Factorial of " + i + " : " + fact);
        fact = 1;
    }    
}
}