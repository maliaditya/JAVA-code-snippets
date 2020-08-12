/*
Pattern47
   * * * * * * *
     * * * * *
       * * * 
         *
*/

class Patter47{

    public static void main(String[] args) {

        int fspace=1, bspace=7;
        
        for(int i=0;i<5;i++){

            for(int j=0;j<9;j++){

                if(j<fspace ||j>bspace){

                    System.out.print("  ");

                } else{

                System.out.print("* ");

                }
            }
            fspace++;
            bspace--;
            System.out.println();
        }
    }
}