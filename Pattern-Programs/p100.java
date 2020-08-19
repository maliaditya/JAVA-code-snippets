/**
Pattern100

      *         *
     * *       * *
    * * *     * * *
   * * * *   * * * *
  * * * * * * * * * *
 */


class Pattern100{

    public static void main(String[] args) {

        int fspace=4, bspace=9;
        
        for(int i=0;i<=4;i++){

            for(int j=0;j<=9;j++){
                if(j==4 || j==9)
               System.out.print("* ");
               else{
                    if(j<bspace && j >4) {
                        System.out.print("  ");
                    }
                    else if(j<fspace) {
                        System.out.print(" ");
                    }
                    else
                        System.out.print("* ");


               }

                
            }
            bspace--;
            fspace--;
      
            System.out.println();
        }
         


    }
}