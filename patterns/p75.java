/*
Pattern75
      *
     * *
    * * *
   * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
*/

class Pattern75{

    public static void main(String[] args) {
        
        int count=1;

        for(int i=4;i>0;i--){
            System.out.print(" ");

            for (int j=4;j>0;j--){
                if (j>count){
                System.out.print(" ");
                }else{
                System.out.print("* ");
                }

            }

            count++;
        
        System.out.println();
        }   

        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(j<i)
                System.out.print(" ");
                else
                System.out.print("* ");

            

            }
            
            
        
        System.out.println();
        }   
    }
}