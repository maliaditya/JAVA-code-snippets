class CountDigits{
    

    public static void main(String[] args) {
        
        int num =234,count = 0;

        while(num>0){
            count++;
            num= num/10;
        }

    System.out.println("No. of digits "+ count);
    }
}