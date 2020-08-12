/*

 * * * * * * * * * *
  * * * *     * * * *
  * * *         * * *
  * *             * *
  *                 *
*/

class Pattern96{

    public static void main(String[] args) {
        
        int fspace=5,bspace=4;


        for(int i=0;i<=4;i++){

            for (int j=0;j<=9;j++){
                    if(j<fspace || j>bspace){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
            }
            fspace--;
            bspace++;
            System.out.println();
        }
    }
  }