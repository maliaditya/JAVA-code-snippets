class OddEven{

    static int isEven(int number) 
    { 
  
        if ((number ^ 1) == number + 1) 
            return 0; 
        else
            return 1; 
    } 

    public static void main(String[] args) {
        int number =1;

        if(isEven(number) ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");

        }
    }
}