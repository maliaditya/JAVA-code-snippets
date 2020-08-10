class AddMul{

    public static void main(String[] args) {
        

        int num = 12345, add = 0, mul = 1 ,temp;

        while(num >=1 ){

            temp = num % 10;
            
            if(num % 2 ==0){
                add = add + temp;
            } else{
                mul = mul * temp;
            }
            num = num /10;
        }
        System.out.println("The addition of even number is : " + add);
        System.out.println("The Multiplication of Odd number ia : " + mul);


    }

}