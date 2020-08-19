/*

Pattern69
 * * * * *
  * * * *
   * * *
    * *
     *
*/

class Pattern29{

    
    public static void main(String[] args) {
        
        int j;

        for(int i=0;i<5;i++){
            for (j=0;j<5;j++){
                if(j<i)
                System.out.print(" ");
                else
                System.out.print("* ");

            

            }
            
            
        
        System.out.println();
        }   
    }
}