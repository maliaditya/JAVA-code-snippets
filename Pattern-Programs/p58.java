/*

Pattern58          
D 
C D
B C D
A B C D
B C D
C D
D 

*/ 



class Pattern58{

    public static void main(String[] args) {
        int p=3;
        for(int i=0;i<=4;i++){
        
            for(int j=0;j<i;j++){
                ++p;
                System.out.print((char)(65+p)+" ");
            
             }
             for(int q = 0;q<=i;q++){
                p--;
    }
            System.out.println();
        }

        int q=0;
        for(int i=3;i>0;i--){
            
            for(int j=1;j<=i;j++){
                    if(i<3){
                        System.out.print((char)(65+(j+q))+" ");

                    }else
                    System.out.print((char)(65+j)+" ");
                    

            
             }
             q++;
            System.out.println();
        }

        

    }
}