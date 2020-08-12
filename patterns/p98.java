/*
Pattern98
  0 1 2 3 4 5 6 7
 0 *             *
 1 * *         * *
 2 * * *     * * *
 3 * * * * * * * *
 4 * * *     * * *
 5 * *         * *
 6 *             *
*/

class Patter98{

    public static void main(String[] args) {

        int fspace=1, bspace=6;
        
        for(int i=0;i<4;i++){

            for(int j=0;j<=7;j++){

                if(j<fspace ||j>bspace){

                    System.out.print("* ");

                } else{

                System.out.print("  ");

                }
            }
            fspace++;
            bspace--;
            System.out.println();
        }
         fspace=3;bspace=4;

        for(int i=0;i<=2;i++){

            for (int j=0;j<=7;j++){
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