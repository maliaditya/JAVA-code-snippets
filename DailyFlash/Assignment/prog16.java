class SelfDrivingNo{


    static int selfDrivingNo(int num ){
        int a=num,count =0;
        while(num>0){

            int temp = num% 10;

            if(a%temp == 0 ){
                count++;
            }
            num = num /10;
        }

        return count;
    }


    
    public static void main(String[] args) {
    

        for(int i=10;i<=100;i++){

            if(i%10 == 0){
                continue;
            }else{
            if(selfDrivingNo(i)==2){
                System.out.print(i + " ");
            }


        }
           
    }
    System.out.print( " are the self driving number from till 100.");

}
}