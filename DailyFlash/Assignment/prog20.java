class AlphabetPattern{

    public static void main(String[] args) {
        int a= 64,Ccount=1, Scount=1,b=96;
        
        for(int i=1;i<=4;i++){
            for(int j=0;j<4;j++){
                if(i%2!=0){
                    System.out.print((char)(a+Ccount)+" ");
                    Ccount++;
                }else{
                    System.out.print((char)(b+Scount)+" ");
                    Scount++;
                }

            }
            System.out.println();
        }
    }
}