class Pattern{

    public static void main(String[] args) {
        int p=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){

                if(j<i+1){
                System.out.print(p*p*p +" ");
                 p++;

                }
            }
        System.out.println();

        }
    
    }

}