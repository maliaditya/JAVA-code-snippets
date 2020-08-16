class AlphabetsPattern{

    public static void main(String[] args) {
        int a= 64,count=1;
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){

                System.out.print((char)(a+count)+" ");
                count++;
            }
            System.out.println();
        }
    }
}