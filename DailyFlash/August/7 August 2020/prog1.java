class CountDigits{

    public static void main(String[] args) {
        
        int num = 12345, counter = 0;

        while(num > 0){

            num = num /10;
            counter++;
        }
        System.out.println(counter);
    }
}