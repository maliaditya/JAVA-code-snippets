class DigitOccuranceCount{

    public static void main(String[] args) {
        int count=0;
        long num = 345669760562L;

        while(num>0){


            if( num %10  == 6){
                count++;
            }

            num = num/10;
        }
        num = 345669760562l;
        System.out.println("The occurrence of 6 in number " + num +" "+ count);

    }
}