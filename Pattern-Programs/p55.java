/*

Pattern55
3 
3 2 
3 2 1 
3 2 1 0
3 2 1 
3 2
3 

*/ 



class Pattern55{

    public static void main(String[] args) {
        int p=3;
        for(int i=0;i<=4;i++){
        
            for(int j=0;j<i;j++){
                  System.out.print(p-j+" ");
            
             }
            System.out.println();
        }


        for(int i=3;i>0;i--){
        
            for(int j=0;j<i;j++){
                System.out.print(p-j+" ");

            
             }
            System.out.println();
        }

        

    }
}