class Average{

    public static void main(String[] args) {
        
        int num = 12345, temp,add = 0,count = 0,avg = 0;

        while(num>0){

            temp=num%10;
            add = add + temp;

            num = num/10;
            count++ ;
        }
             avg = add/count;
             System.out.println("The average of digits from 12345 is: "+  avg);
    }
}