class First50OddNos{

    public static void main(String[] args) {
        
        int i = 0,count =0;
        while(count != 50){

            if( i%2!=0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }
}