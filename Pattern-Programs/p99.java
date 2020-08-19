/**
Pattern99

        *             *
      * * *         * * *
    * * * * *     * * * * *
  * * * * * * * * * * * * * *
 */


class Patter99{

    public static void main(String[] args) {

        int fspace=4, bspace=9, rspace=10,lspace=3;
        
        for(int i=0;i<4;i++){

            for(int j=0;j<=13;j++){

                if(j<fspace ||j>bspace){
                    if(j<lspace || j >rspace ){
                    System.out.print("  ");

                    }else
                    System.out.print("* ");



                } else{

                System.out.print("  ");

                }
            }
            lspace--;
            rspace++;
            fspace++;
            bspace--;
            System.out.println();
        }
         


    }
}