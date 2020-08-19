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



class Pattern59{

    public static void main(String[] args) {

        for(int i=4;i>0;i--){
            for(int j=0;j<4;j++){

                if(j<i){
                    System.out.print("  ");
                } else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<=3;i++){
            for (int j=0;j<4;j++){
                if(j<i)
                System.out.print("  ");
                else
                System.out.print("* ");

            

            }
            
            
        
        System.out.println();
        }  
        

    }
}