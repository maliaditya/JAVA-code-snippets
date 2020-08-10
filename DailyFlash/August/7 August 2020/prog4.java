class Maximum{

    public static void main(String[] args) {
        
        int num =  12357798 ,  temp , greater =0;

        while(num > 0){
            temp = num % 10;

            if(temp > greater){
                greater = temp;
            }
            
            num = num /10;
        }
        System.out.println(greater);
    }
}