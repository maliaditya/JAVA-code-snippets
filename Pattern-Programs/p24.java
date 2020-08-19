/*
Pattern24
         *
       * *
     * * *
   * * * * 
 * * * * *
*/

class Pattern24{

    public static void main(String[] args) {
        
        int j,count=1;

        for(int i=5;i>0;i--){
            for (j=5;j>0;j--){
                if (j>count){
                System.out.print("  ");
                }else{
                System.out.print("* ");
                }

            }

            count++;
        
        System.out.println();
        }   
    }
}