/*

Pattern57
D
D C
D C B
D C B A
D C B
D C
D 

*/ 



class Pattern57{

    public static void main(String[] args) {
        int p=3;
        for(int i=0;i<=4;i++){
        
            for(int j=0;j<i;j++){
                  System.out.print((char)(65+(p-j))+" ");
            
             }
            System.out.println();
        }


        for(int i=3;i>0;i--){
        
            for(int j=0;j<i;j++){
                System.out.print((char)(65+(p-j))+" ");


            
             }
            System.out.println();
        }

        

    }
}