class BinaryPattern{
    public static void main(String[] args) {
        
        int p = 0;
    
        for(int i=4;i>=0;i--){
            for(int j=1;j<=5;j++){
                if(j>i){
                System.out.print(p);
                if(p==0)
                p=1;
                else
                p=0;

                }
                else{
                    System.out.print(" ");
                }
            }
            p=0;
            System.out.println();

        }
    }
}